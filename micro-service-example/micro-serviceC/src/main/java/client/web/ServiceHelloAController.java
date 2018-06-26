package client.web;/**
 * Created by Yuanjp on 2017/12/6 0006.
 */

import client.common.utils.R;
import client.service.MicroServiceC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yuanjp
 * @create 2017-12-06-16:19
 */
@RestController
public class ServiceHelloAController {

    @Autowired private MicroServiceC microServiceC;
    @Value("${server.port}")
    String port;

    @RequestMapping("/say")
    public String sayHelloA(@RequestParam String name) throws InterruptedException {
        Thread.sleep(7000L);
        return "hi ,["+name+"@"+port+"], "+", i am service-c";
    }

    @GetMapping("/visit-say")
    public R visitSay(@RequestParam String name){
        return R.ok(microServiceC.visitSay(name));
    }

    @RequestMapping("/visit-person")
    public R visitPerson(@RequestParam String name, @RequestParam String age){
        return R.ok(microServiceC.visitPerson(name,age));
    }

}
