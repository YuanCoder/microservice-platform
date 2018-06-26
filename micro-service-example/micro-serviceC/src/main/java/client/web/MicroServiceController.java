package client.web;/**
 * Created by Yuanjp on 2018/2/5 0005.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yuanjp
 * @create 2018-02-05-14:52
 */
@RestController
@RequestMapping("/mic")
public class MicroServiceController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/say")
    public String sayHelloA(@RequestParam String name) throws InterruptedException {
        Thread.sleep(7000L);
        return "hi ,["+name+"@"+port+"], "+", i am service-c";
    }
}
