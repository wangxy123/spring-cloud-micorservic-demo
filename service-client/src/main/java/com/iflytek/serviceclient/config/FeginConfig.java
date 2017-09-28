package com.iflytek.serviceclient.config;

import com.iflytek.serviceclient.hystrix.ServiceProviderImpl;
import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author xywang
 * @create 2017-09-28 23:07
 **/

public class FeginConfig {
    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }

    @Bean
    public ServiceProviderImpl fb(){
        return new ServiceProviderImpl();
    }
}
