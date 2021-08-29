package com.test.controller;

import com.test.pa.A;
import com.test.pa.B;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
    @RequestMapping("say")
    public B say(@RequestBody A a){
        return new B();
    }
}
