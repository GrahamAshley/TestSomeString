package com.test.pa;

import lombok.SneakyThrows;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName MouseController
 * @Description TODO
 * @Author 101217
 * @Date 2021/8/26 13:34
 */
public class MouseController implements Runnable {
    private Dimension dim;
    private Random rand;
    private Robot robot;
    private volatile boolean stop = false;
    public MouseController() {
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        rand = new Random();
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }
    @SneakyThrows
    public void run() {
//        pressMultipleKeyByNumber(KeyEvent.VK_CONTROL,524,39);
        while(!stop) {
            BigDecimal width10 = new BigDecimal(dim.getSize().getWidth()).multiply(new BigDecimal(0.1));
            BigDecimal width90 = new BigDecimal(dim.getSize().getWidth()).multiply(new BigDecimal(0.9));
            double x = MouseInfo.getPointerInfo().getLocation().getX();
            if (x<width10.doubleValue()){
                TimeUnit.MILLISECONDS.sleep(100);
                if (x-MouseInfo.getPointerInfo().getLocation().getX()>150)
                pressMultipleKeyByNumber(KeyEvent.VK_CONTROL,524,37);
            }else if (x>width90.doubleValue()){
                TimeUnit.MILLISECONDS.sleep(100);
                if (MouseInfo.getPointerInfo().getLocation().getX()-x>150)
                pressMultipleKeyByNumber(KeyEvent.VK_CONTROL,524,39);
            }
        }
    }
    public synchronized void stop() {
        stop = true;
    }
    public static void main(String[] args) throws InterruptedException {
        MouseController mc = new MouseController();
        Thread mcThread = new Thread(mc);
        System.out.println("Mouse Controller start");
        mcThread.start();
        mcThread.join();
        mc.stop();
        System.out.println("Mouse Controller stoped");
    }
    /**
     * 按下组合键，如 ctrl + c、ctrl + v、alt + tab 等等
     *
     * @param keycode：组合健数组，如 {KeyEvent.VK_CONTROL,KeyEvent.VK_V}
     */
    public static void pressMultipleKeyByNumber(int... keycode) {
        try {
            Robot robot = new Robot();

            //按顺序按下健
            for (int i = 0; i < keycode.length; i++) {
                robot.keyPress(keycode[i]);
                robot.delay(50);
            }
            //按反序松开健
            for (int i = keycode.length - 1; i >= 0; i--) {
                robot.keyRelease(keycode[i]);
                robot.delay(10);
            }
        } catch (AWTException e) {
          e.printStackTrace();
        }
    }

}
