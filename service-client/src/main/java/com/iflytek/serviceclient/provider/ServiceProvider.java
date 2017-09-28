package com.iflytek.serviceclient.provider;

import com.iflytek.serviceclient.config.FeginConfig;
import com.iflytek.serviceclient.hystrix.ServiceProviderImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xywang
 * @create 2017-09-26 21:23
 **/
@FeignClient(name= "service-provider" , fallback = ServiceProviderImpl.class )
public interface ServiceProvider {
    @RequestMapping(value = "/name")
    String name(@RequestParam(value = "name") String name);
}
