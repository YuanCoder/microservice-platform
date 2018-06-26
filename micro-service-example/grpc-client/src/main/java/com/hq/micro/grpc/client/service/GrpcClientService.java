package com.hq.micro.grpc.client.service;


import com.hq.micro.grpc.common.HelloReply;
import com.hq.micro.grpc.common.HelloRequest;
import com.hq.micro.grpc.common.SimpleGrpc;
import io.grpc.Channel;

import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 调用GrpcServer
 * @author Yuanjp
 * @create 2018-02-28-16:35
 */
@Service
public class GrpcClientService {

    private static final Logger log = LoggerFactory.getLogger(GrpcClientService.class);

    @GrpcClient("micro-grpc-server")
    private Channel serverChannel;

    public String sendMessage(String name) {
        SimpleGrpc.SimpleBlockingStub stub = SimpleGrpc.newBlockingStub(serverChannel);
        HelloReply response = stub.sayHello(HelloRequest.newBuilder().setName(name).build());
        String respMsg = response.getMessage();
        log.info("grpc消费者收到：--》"+respMsg);
        return respMsg;
    }
}
