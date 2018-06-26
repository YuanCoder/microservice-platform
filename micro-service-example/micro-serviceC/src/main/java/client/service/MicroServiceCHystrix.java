package client.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 断路器
 * Created by Yuanjp on 2018/1/10 0010.
 */
@Component
public class MicroServiceCHystrix implements MicroServiceC {
    @Override
    public String visitSay(@RequestParam(value = "name") String name) {
        return name+" sorry,service error!";
    }

    @Override
    public String visitPerson(@RequestParam(value = "name") String name, @RequestParam(value = "age") String age) {
        return name+" sorry,service error!";
    }
}
