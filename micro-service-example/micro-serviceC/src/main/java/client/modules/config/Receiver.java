package client.modules.config;/**
 * Created by Yuanjp on 2017/12/21 0021.
 */

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费者
 *
 * @author Yuanjp
 * @create 2017-12-21-17:07
 */
//@Component
//@RabbitListener(queues = "hello_bus")    //消息消费者监听hello_bus这个消息队列
//public class Receiver {
//
//    @RabbitHandler   //@RabbitHandler注解则表示process方法是用来处理接收到的消息的
//    public void process(String msg) {
//        System.out.println("i am Receiver ,my name is service-C, receive:"+msg);
//    }
//}
