package com.hq.micro.zipkin.server.gateway.zuul.web;/**
 * Created by Yuanjp on 2017/12/29 0029.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * api网关控制类
 * @author Yuanjp
 * @create 2017-12-29-16:03
 */
@RestController
public class ApiGatewayController {
    @Value("${server.port}")
    String port;

    @Value("${app.msg}")
    String msg;

    @RequestMapping(value = "/get-port")
    public String getPort(){
        return port;
    }

    @RequestMapping(value = "/get-msg")
    public String msg(){
        return msg;
    }
}
