package client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * fegin 调用服务层
 * Created by Yuanjp on 2018/1/2 0002.
 */
@FeignClient(value = "service-b", fallback = MicroServiceCHystrix.class)
public interface MicroServiceC {
    @GetMapping("/say")
    String visitSay(@RequestParam(value = "name") String name);

    @PostMapping("/person")
    String visitPerson(@RequestParam(value = "name") String name, @RequestParam(value = "age") String age);
}
