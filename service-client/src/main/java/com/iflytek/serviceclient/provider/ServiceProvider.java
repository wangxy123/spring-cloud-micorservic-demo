package com.iflytek.serviceclient.provider;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xywang
 * @create 2017-09-26 21:23
 **/
@FeignClient(name= "service-provider")
public interface ServiceProvider {
    @RequestMapping(value = "/name")
    String name(@RequestParam(value = "name") String name);
}
