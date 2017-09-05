package com.iflytek.serviceprovider.controller;

import com.iflytek.serviceprovider.common.ConfigUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MainControoller {
    @Autowired
    ConfigUtil config;


    @Value("${test1}")
    private String test1;
    @RequestMapping("/index")
    public String index(){
        return test1;
    }
    @RequestMapping("/name")
    public String name(){
        return config.getName();
    }
    @RequestMapping("/pass")
    public String pass(){
        return config.getPass();
    }
}
