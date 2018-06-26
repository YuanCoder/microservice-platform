package com.hq.micro.zipkin.server.gateway.zuul;
/**
 * Created by Yuanjp on 2017/12/26 0026.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 路由网关
 * zuul 默认具有线程隔离和断路器的自我保护功能
 *
 * @author Yuanjp
 * @create 2017-12-26-16:50
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy //开启Zuul
public class ApiGatewayApplication {

    private static final Logger logger = LoggerFactory.getLogger(ApiGatewayApplication.class);

    public static void main(String[] args){
        SpringApplication.run(ApiGatewayApplication.class, args);

        logger.info("====================启动成功!====================");
    }
}
