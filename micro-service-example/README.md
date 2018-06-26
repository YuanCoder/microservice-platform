# micro-server
模拟服务
#### micro-serverA


    spring.application.name=ServiceHelloA
    server.port=8100
    
    eureka.client.serviceUrl.defaultZone=http://admin:hqjymicro@localhost:8100/eureka

#### micro-serverB

	spring.application.name=ServiceHelloA
    server.port=8100
    
    eureka.client.serviceUrl.defaultZone=http://admin:hqjymicro@localhost:8100/eureka

同一应用服务，不同开放端口
