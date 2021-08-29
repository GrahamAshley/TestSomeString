package com.test.pa;

import lombok.Data;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Author user
 * @Date 2021/6/18
 * @Version 1.0
 */
@Data
public class A {
    public String name;

    public void say(long l,long size) throws IllegalAccessException {
        StringBuilder stringBuilder = new StringBuilder();
        Field declaredField = Unsafe.class.getDeclaredFields()[0];
        declaredField.setAccessible(true);
        Unsafe unsafe = (Unsafe) declaredField.get(null);
        while (size-->0){
            byte aByte = unsafe.getByte(l);
            l++;
            stringBuilder.append('c');
            stringBuilder.append(aByte);
        }
        System.out.println(stringBuilder.toString());
    }
}
