package com.hq.micro.zipkin.server.eureka.server;/**
 * Created by Yuanjp on 2017/12/6 0006.
 */

import com.netflix.appinfo.InstanceInfo;
import com.netflix.eureka.lease.LeaseManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer  服务注册中心
 *
 * @author Yuanjp
 * @create 2017-12-06-15:02
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    private static final Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args){
/*
      Eureka核心类：
          InstanceInfo 代表注册服务实例
          LeaseInfo 标识应用实例的租约信息 这些参数主要用于标识应用实例的心跳情况，如：约定的心跳周期、租约有效期、最近一次续约时间
          ServiceInstance 是对服务发现实例信息的抽象接口，约定了服务发现的实例应用有哪些通用的信息
          InstanceInfo.InstanceStatus  是一个枚举用于标识服务实例的状态
      服务的核心操作
          服务注册（register）
          服务下线（cancel）
          服务租约（renew）
          服务剔除（evict）
         LeaseManager 接口定义了应用服务实例（写操作的相关方法）在服务中心的上述4个操作方法

*/



        SpringApplication.run(EurekaServerApplication.class, args);
        logger.info("====================启动成功!====================");

    }
}
