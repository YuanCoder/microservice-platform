package com.hq.micro.grpc.client.controller;

import com.hq.micro.grpc.client.service.GrpcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/12/4
 */
@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/")
    public String printMessage(@RequestParam(defaultValue = "hq") String name) {
        return grpcClientService.sendMessage(name);
    }
}
