package com.hq.micro.zipkin.server.service.client;/**
 * Created by Yuanjp on 2017/12/6 0006.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * @author Yuanjp
 * @create 2017-12-06-16:21
 */
@EnableFeignClients //开启扫描Spring Cloud Feign客户端的功能
@EnableEurekaClient
@SpringBootApplication
public class ServiceClientApplication {
    private static final Logger logger = LoggerFactory.getLogger(ServiceClientApplication.class);

    public static void main(String[] args){

        SpringApplication.run(ServiceClientApplication.class, args);

        logger.info("====================启动成功!====================");
    }

}
