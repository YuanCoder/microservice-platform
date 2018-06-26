/**
 * Created by Yuanjp on 2018/1/15 0015.
 */

import client.modules.config.SinkSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 测试类
 *
 * @author Yuanjp
 * @create 2018-01-15-18:05
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = ServiceClientApplicationTests.class)
@WebAppConfiguration
public class ServiceClientApplicationTests {
    @Autowired private SinkSender sinkSender;

    @Test
    public void contextLoads(){
        sinkSender.output().send(MessageBuilder.withPayload("From SinkSender") .build());
    }
}
