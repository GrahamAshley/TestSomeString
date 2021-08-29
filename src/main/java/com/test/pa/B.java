package com.test.pa;

import lombok.Data;

/**
 * @Author user
 * @Date 2021/6/18
 * @Version 1.0
 */
@Data
public class B extends A{

    private String namea="asdsdadsa";

    @Override
    public  void say(long l, long size) throws IllegalAccessException {
        super.say(l, size);
    }
}
