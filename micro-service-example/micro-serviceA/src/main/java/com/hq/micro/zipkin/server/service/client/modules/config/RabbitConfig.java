package com.hq.micro.zipkin.server.service.client.modules.config;/**
 * Created by Yuanjp on 2017/12/21 0021.
 */

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置消息队列Bean
 *
 * @author Yuanjp
 * @create 2017-12-21-17:11
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello_bus"); //创建一个名为hello_bus的消息队列
    }
}
