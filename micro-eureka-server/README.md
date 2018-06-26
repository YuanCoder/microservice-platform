
## micro-eureka-server 服务发现与注册中心

    server.port=8100
    eureka.client.service-url.defaultZone:  http://${eureka.instance.hostname}:${server.port}/eureka/
