/*
 * COPYRIGHT. ShenZhen JiMi Technology Co., Ltd. 2017.
 * ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system, or transmitted,
 * on any form or by any means, electronic, mechanical, photocopying, recording, 
 * or otherwise, without the prior written permission of ShenZhen JiMi Network Technology Co., Ltd.
 *
 * Amendment History:
 * 
 * Date                   By              Description
 * -------------------    -----------     -------------------------------------------
 * 2017年8月29日    Li.Shangzhi         Create the class
 * http://www.jimilab.com/
*/
package com.hq.micro.zipkin.server.service.client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author Yuanjp
 * @create 2017-12-06-15:02
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceClientApplication {
	private static final Logger logger = LoggerFactory.getLogger(ServiceClientApplication.class);
	
    public static void main(String[] args){
        SpringApplication.run(ServiceClientApplication.class, args);
        
        logger.info("====================启动成功!====================");
    }  

}
