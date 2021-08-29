package com.test.pa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AfterRun implements CommandLineRunner {
    @Autowired
    private Pa pa;
    @Override
    public void run(String... args) throws Exception {
        pa.getall();
    }
}
