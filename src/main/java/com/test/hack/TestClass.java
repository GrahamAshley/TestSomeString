package com.test.hack;
/**
 * @Author 101217
 * @Date 2021/8/6
 * @Version 1.0
 */
public class TestClass {
    public static void main(String[] args) {
        System.out.println("hello world!!!");
        ClassLoader cl = TestClass.class.getClassLoader();
        System.out.println("self: " + cl);
        while (cl.getParent() != null) {
            System.out.println(cl.getParent().getClass());
            cl = cl.getParent();
        }
    }
}
