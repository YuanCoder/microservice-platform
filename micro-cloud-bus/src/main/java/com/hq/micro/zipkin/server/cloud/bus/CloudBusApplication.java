package com.hq.micro.zipkin.server.cloud.bus;/**
 * Created by Yuanjp on 2017/12/12 0012.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 消息总线
 *
 * @author Yuanjp
 * @create 2017-12-12-14:46
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudBusApplication {
    private static final Logger logger = LoggerFactory.getLogger(CloudBusApplication.class);

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudBusApplication.class , args);

        logger.info("====================启动成功!====================");
    }

}
