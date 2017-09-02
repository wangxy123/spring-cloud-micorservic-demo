package com.iflytek.serviceprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MainControoller {
    @Value("${test1}")
    private String test1;
    @RequestMapping("/index")
    public String index(){
        return test1;
    }
}
