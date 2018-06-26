package com.hq.micro.zipkin.server.service.client.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 断路器
 * Created by Yuanjp on 2018/1/10 0010.
 */
@Component
public class MicroServiceBHystrix implements MicroServiceB{
    @Override
    public String visitSay(@RequestParam(value = "name") String name) {
        return name+" sorry,service error!";
    }
}
