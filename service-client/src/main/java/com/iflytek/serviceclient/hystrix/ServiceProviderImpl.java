package com.iflytek.serviceclient.hystrix;

import com.iflytek.serviceclient.provider.ServiceProvider;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xywang
 * @create 2017-09-28 20:47
 **/
@Component
public class ServiceProviderImpl implements ServiceProvider {

    @Override
    public String name(@RequestParam(value = "name") String name) {
        return "Feign客户端访问失败";
    }
}
