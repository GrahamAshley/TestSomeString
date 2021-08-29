package com.test;

import cn.hutool.core.date.DateUtil;
import com.test.pa.SimpleHttpServer;
import com.test.pa.TestSync;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName TestNormal
 * @Description TODO
 * @Author 101217
 * @Date 2021/8/24 14:42
 */
@RunWith(JUnit4.class)
public class TestNormal {

    @Test
    public void testDate(){
        Date tomorrowdate = DateUtil.tomorrow().toJdkDate();
        System.out.println(tomorrowdate);
    }
    @Test
    public void testAtomic(){
// 获取Java线程管理MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
// 不需要获取同步的monitor和synchronizer信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
// 遍历线程信息，仅打印线程ID和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.
                    getThreadName());
        }

    }
    @Test
    public void testJoin() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                while (true){
                   try {
                       System.out.println("p");
                   }catch (Exception e){
                       e.printStackTrace();
                       System.out.println("-------------");
                   }
                }
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                while (true){
                    try {
                        System.out.println("p");
                    }catch (Exception e){
                        e.printStackTrace();
                        System.out.println("-------------");
                    }
                }
            }
        });
        thread1.setDaemon(false);
        thread1.start();
        thread.setDaemon(true);
        thread.start();
        for(int i=0;i<100;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }

    @Test
    public void testInterrupt(){
        Object A = new Object();
        String s="hello";
        final String[]sA={" "};
       final AtomicBoolean flag=new AtomicBoolean(true);
         Runnable runnableA = new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                synchronized (A){
                  while (true){
                      A.notify();
                      if (sA[0]==s){
                          break;
                      }
                      if (s.indexOf(sA[0])!=-1){
                          sA[0]=s.substring(0,sA[0].length()+1);
                          System.out.println(s.substring(sA[0].length()-1,sA[0].length()));
                      }else {
                          sA[0]="h";
                          System.out.println(sA[0]);
                      }
                      A.wait();
                  }
                }
            }
        };
        Runnable runnableB = new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                synchronized (A){
                   while (true){
                       A.notifyAll();
                       if (sA[0]==s){
                           break;
                       }
                       if (s.indexOf(sA[0])!=-1){
                           sA[0]=s.substring(0,sA[0].length()+1);
                           System.out.println(s.substring(sA[0].length()-1,sA[0].length()));
                       }else {
                           sA[0]="h";
                           System.out.println(sA[0]);
                       }
                       A.wait();
                   }
                }
            }
        };

        new Thread(runnableA).start();
        new Thread(runnableB).start();
        while (true){

        }
    }
    @Test
    public void testSync(){
        TestSync testSync = new TestSync();
        new Thread(new Runnable() {
           @SneakyThrows
           @Override
           public void run() {
               while (true){
                   System.out.println(testSync.get()+Thread.currentThread().getName());
               }
           }
       }).start();
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
               while (true){
                   testSync.add();
                   System.out.println(Thread.currentThread().getName());
               }
            }
        }).start();
        while (true){

        }
    }

    @Test
    public void testWeb() throws Exception {
        SimpleHttpServer.start();
    }
}
class Counter{
    private AtomicInteger atomicI = new AtomicInteger(0);
    private int i = 0;
    public static void main(String[] args) {
        final Counter cas = new Counter();
        List<Thread> ts = new ArrayList<Thread>(600);
        long start = System.currentTimeMillis();
        for (int j = 0; j < 100; j++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        cas.count();
                        cas.safeCount();
                    }
                }
            });
            ts.add(t);
        }
        for (Thread t : ts) {
            t.start();
        }
// 等待所有线程执行完成
        for (Thread t : ts) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(cas.i);
        System.out.println(cas.atomicI.get());
        System.out.println(System.currentTimeMillis() - start);
    }
    /** * 使用CAS实现线程安全计数器 */
    private void safeCount() {
        for (;;) {
            int i = atomicI.get();
            boolean suc = atomicI.compareAndSet(i, ++i);
            if (suc) {
                break;
            }
        }
    }
    /**
     * 非线程安全计数器
     */
    private void count() {
        i++;
    }
}
