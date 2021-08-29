package com.test.pa;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName SleepUtils
 * @Description TODO
 * @Author 101217
 * @Date 2021/8/25 16:58
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}
