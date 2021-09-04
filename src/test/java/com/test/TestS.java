package com.test;

import org.assertj.core.util.Maps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.*;

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
        List<String>list1=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.addAll(list1);
//        list.forEach(System.out::println);
        Map<Integer, Integer> integerIntegerMap = Maps.newHashMap(1, 1);
        TreeMap<Integer, Integer> objectTreeMap = new TreeMap<>();
        integerIntegerMap.put(12,1);
        integerIntegerMap.put(1,12);
        integerIntegerMap.put(6,6);
//        System.out.println(integerIntegerMap);
        Map<String,Map<Integer, Integer>>map=new HashMap<>();
        map.put("list",integerIntegerMap);
//        System.out.println(JSONUtil.toJsonStr(map));
        LinkedHashMap<Integer, Integer> objectObjectLinkedHashMap = new LinkedHashMap<>();

    }
}
