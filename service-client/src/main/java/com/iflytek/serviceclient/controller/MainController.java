package com.iflytek.serviceclient.controller;

import com.iflytek.serviceclient.provider.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xywang
 * @create 2017-09-26 21:28
 **/
@RestController
public class MainController {

    @Autowired
    ServiceProvider serviceProvider;

    @RequestMapping(value = "/name" , method = RequestMethod.GET)
    public String name(String name){
        return "service-client:"+serviceProvider.name(name);
    }
}
