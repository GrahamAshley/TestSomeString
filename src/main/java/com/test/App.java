package com.test;


import com.test.mapper.GetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class App  {
    public static String a="s";
    private  int  b=0;
    static {
        a="ssd";
    }

    public  int getB() {
        return b;
    }
    @Autowired
    private ApplicationContext context;
    private static ApplicationContext context1;
    public void setB(int b) {
        this.b = b;
    }
    @Autowired
    private GetMapper getMapper;
    private static GetMapper getMapperApp;
    @PostConstruct
    public void init( ){
        getMapperApp=getMapper;
        context1=context;
    }
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
        List<String> list= getMapperApp.getDatebase();
        System.out.println(list);

    }
    static class DC extends App{

    }
}
