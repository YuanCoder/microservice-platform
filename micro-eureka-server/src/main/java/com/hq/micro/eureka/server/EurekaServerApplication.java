package com.hq.micro.eureka.server;/**
 * Created by Yuanjp on 2017/12/6 0006.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
     1 Eureka核心类：
          InstanceInfo 代表注册服务实例
          LeaseInfo 标识应用实例的租约信息 这些参数主要用于标识应用实例的心跳情况，如：约定的心跳周期、租约有效期、最近一次续约时间
          ServiceInstance 是对服务发现实例信息的抽象接口，约定了服务发现的实例应用有哪些通用的信息
          InstanceInfo.InstanceStatus  是一个枚举用于标识服务实例的状态
     2 服务的核心操作
          服务注册（register）
          服务下线（cancel）
          服务租约（renew）
          服务剔除（evict）
         LeaseManager 接口定义了应用服务实例（写操作的相关方法）在服务中心的上述4个操作方法

     3 SELF PRESERVATION(自我保护设置)
        在分布式系统设计里头，通常需要对应用实例的存活进行键康检查，这里比较关键的问题就是要处理好网络偶尔抖动或短哲不可用时造成的误判。
        另外Eureka Server端与Client端之间如果出现网络分区问题，在极端I青况下可能会使得Eureka Server清空部分服务的 实例列表，这个将严重影响
        到Eureka Server的Availibility属性。因此Eureka Server引入了SELF PRESERVATION机制。
        Eureka Client端与Server端之间有个租约，Client要定时(默认30秒)发送心跳来维持这个租约，表示自己还存活看。
        Eureka通过当前注册的实例数，去计算每分钟应该从应用实例接收到的心跳数，如果最近一分钟接收到的续约的次数小于指定阀值（比率默认0.85）的话，则关闭租约失效剔除， 禁止定时任务剔除失效的实例，从而保护注册信息。
*/
        SpringApplication.run(EurekaServerApplication.class, args);
        logger.info("====================启动成功!====================");

    }
}
