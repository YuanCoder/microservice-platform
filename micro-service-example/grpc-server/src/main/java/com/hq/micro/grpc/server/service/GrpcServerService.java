package com.hq.micro.grpc.server.service;



import com.hq.micro.grpc.common.HelloReply;
import com.hq.micro.grpc.common.HelloRequest;
import com.hq.micro.grpc.common.SimpleGrpc;
import io.grpc.stub.StreamObserver;

import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/11/8
 */

@GrpcService(SimpleGrpc.class)
public class GrpcServerService extends SimpleGrpc.SimpleImplBase {

    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello =============> " + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
