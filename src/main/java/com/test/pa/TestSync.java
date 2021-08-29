package com.test.pa;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestSync
 * @Description TODO
 * @Author 101217
 * @Date 2021/8/27 14:09
 */
public class TestSync {

    private Integer test=0;
    public synchronized Integer get() throws InterruptedException {
        System.out.println("----------------");
        TimeUnit.SECONDS.sleep(5);
        return this.test;
    }

    public synchronized void add(){
        this.test++;
    }
}
