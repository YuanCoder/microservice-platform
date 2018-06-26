package com.hq.micro.zipkin.server.eureka.server;/**
 * Created by Yuanjp on 2017/12/6 0006.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer  服务注册中心
 *
 * @author Yuanjp
 * @create 2017-12-06-15:02
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    private static final Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args){

        SpringApplication.run(EurekaServerApplication.class, args);
        logger.info("====================启动成功!====================");

    }
}
