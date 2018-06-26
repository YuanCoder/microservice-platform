package client.modules.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 将Input消息通道作为 输出通道的接口
 * Created by Yuanjp on 2018/1/15 0015.
 */
public interface SinkSender {

    @Output(Sink.INPUT)
    MessageChannel output();

}
