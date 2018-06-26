package com.hq.micro.zipkin.server.service.client.web;/**
 * Created by Yuanjp on 2017/12/6 0006.
 */

import com.hq.micro.zipkin.server.service.client.common.utils.R;
import com.hq.micro.zipkin.server.service.client.modules.config.Sender;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @author Yuanjp
 * @create 2017-12-06-16:19
 */
@RestController
public class MicroServiceController {

    @Resource private Sender sender;

    @Value("${server.port}")
    String port;

    @Value("${info.msg}")
    String msg;

    @RequestMapping("/say")
    public String sayHelloA(@RequestParam String name) {
        return "hi ,["+name+"@"+port+"], "+" i am service-a";
    }

    @RequestMapping("/msg")
    public String getConfigMsg() {
        return "this msg is："+msg;
    }

    /**
     * 单生产者-单消费者
     */
    @RequestMapping("/send")
    public R send(){
        sender.send();
        return R.ok("发送成功!");
    }

}
