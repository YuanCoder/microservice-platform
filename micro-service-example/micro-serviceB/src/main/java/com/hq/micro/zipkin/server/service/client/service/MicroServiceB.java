package com.hq.micro.zipkin.server.service.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * fegin 调用服务层
 * Created by Yuanjp on 2018/1/2 0002.
 */
@FeignClient(value = "service-a", fallback = MicroServiceBHystrix.class)
public interface MicroServiceB {
    @GetMapping("/say")
    String visitSay(@RequestParam(value = "name") String name);
}
