package com.hq.micro.zipkin.server.service.client.modules.config;/**
 * Created by Yuanjp on 2017/12/21 0021.
 */

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 消息生产者
 *
 * @author Yuanjp
 * @create 2017-12-21-17:02
 */
@Component
public class Sender {
    //通过AmqpTemplate直接向某一个消息队列发送消息
    @Autowired private AmqpTemplate rabbitTemplate;

    public void send() {
        String msg = "hello rabbitmq my name is service-a ,i am Serder!";
        System.out.println("Sender:"+msg);
        this.rabbitTemplate.convertAndSend("hello_bus", msg);
    }

}
