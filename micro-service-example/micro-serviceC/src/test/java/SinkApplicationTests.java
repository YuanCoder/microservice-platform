/**
 * Created by Yuanjp on 2017/12/23 0023.
 */

import client.modules.config.SinkSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 *
 * @author Yuanjp
 * @create 2017-12-23-15:35
 */
@RunWith(SpringRunner.class)
@EnableBinding(value = {SinkSender.class})
public class SinkApplicationTests {
    @Autowired  private SinkSender sinkSender;

    @Test
    public void sinkSenderTester() {
        sinkSender.output().send(MessageBuilder.withPayload("produce a message ：http://blog.didispace.com").build());
    }

}
