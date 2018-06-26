package com.hq.micro.config.server;/**
 * Created by Yuanjp on 2017/12/12 0012.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心 服务端
 *
 * @author Yuanjp
 * @create 2017-12-12-16:22
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    private static final Logger logger = LoggerFactory.getLogger(ConfigServerApplication.class);

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class , args);

        logger.info("====================启动成功!====================");
    }
}
