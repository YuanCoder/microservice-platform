package com.hq.micro.zipkin.server.config.client.web;/**
 * Created by Yuanjp on 2017/12/12 0012.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * gitlib 仓库管理类
 *
 * @author Yuanjp
 * @create 2017-12-12-17:47
 */
@RefreshScope       // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
@RestController
public class GitLibRepositoryController {

    @Value("${name}")
    String name;

    @Value("${message}")
    String msg;

    @RequestMapping(value = "/get-name")
    public String hi(){
        return name;
    }

    @RequestMapping(value = "/get-msg")
    public String msg(){
        return msg;
    }
}
