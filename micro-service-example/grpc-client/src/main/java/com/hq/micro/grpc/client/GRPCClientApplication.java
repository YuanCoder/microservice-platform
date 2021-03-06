package com.hq.micro.grpc.client;/**
 * Created by Yuanjp on 2018/2/28 0028.
 */

import com.hq.micro.grpc.client.controller.GrpcClientController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * GPRC调用Demo Client端
 * @author Yuanjp
 * @create 2018-02-28-16:35
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class GRPCClientApplication extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(GRPCClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GRPCClientApplication.class , args);
        logger.info("====================启动成功!====================");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GrpcClientController.class);
    }
}
