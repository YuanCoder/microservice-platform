package com.hq.micro.zipkin.server; /**
 * Created by Yuanjp on 2018/1/25 0025.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * 服务追踪
 *
 * @author Yuanjp
 * @create 2018-01-25-09:06
 */
@EnableEurekaClient
@EnableZipkinStreamServer   //使用Stream方式启动ZipkinServer
@SpringBootApplication
public class ZipkinServerApplication {

    private static final Logger logger = LoggerFactory.getLogger(ZipkinServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class,args);
        logger.info("====================启动成功!====================");
    }
}
