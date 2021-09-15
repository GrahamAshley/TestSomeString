package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestS
 * @Description TODO
 * @Author 101217
 * @Date 2021/9/3 14:35
 */
@RunWith(JUnit4.class)
public class TestS {
    @Test
    public void  testAll(){
        String s="abc";
        List<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1,"d");
        list.stream().forEach(System.out::println);
    }
}
