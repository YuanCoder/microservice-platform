package com.hq.micro.zipkin.server.service.client.web;/**
 * Created by Yuanjp on 2018/1/2 0002.
 */

import com.hq.micro.zipkin.server.service.client.common.utils.R;
import com.hq.micro.zipkin.server.service.client.service.MicroServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * feigin demo
 *
 * @author Yuanjp
 * @create 2018-01-02-15:14
 */
@RestController
public class MicroServiceController {
   @Autowired  MicroServiceB microServiceB;

   @Value("${server.port}")
   String port;

   @RequestMapping("/say")
   public String say(@RequestParam String name) throws InterruptedException {
      Thread.sleep(7000L);
      return "hi ,["+name+"@"+port+"], "+" i am service-b";
   }

   @GetMapping("/visit-say")
   public R visitSay(@RequestParam String name){
      return R.ok(microServiceB.visitSay(name));
   }

   @PostMapping("/person")
   public R person(@RequestParam String name, @RequestParam String age){
      return R.ok("hi , "+" i am service-b, you name is "+name+" and age is "+age);
   }
}
