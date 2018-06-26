package client.modules.config;/**
 * Created by Yuanjp on 2017/12/23 0023.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * RabbitMQ消息的消费者
 *
 * @author Yuanjp
 * @create 2017-12-23-14:56
 */
@EnableBinding(value = {Sink.class,SinkSender.class})
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("Received: " + payload);
    }
}
