package com.hq.micro.zipkin.server.config.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Yuanjp
 * @create 2017-12-12-17:47
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication {
    private static final Logger logger = LoggerFactory.getLogger(ConfigClientApplication.class);

    public static void main(String[] args){
        SpringApplication.run(ConfigClientApplication.class, args);
        logger.info("====================启动成功!====================");
    }
}
