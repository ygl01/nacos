// Copyright (C) 2021 Focus Media Holding Ltd. All Rights Reserved.

package com.ygl.microservice.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author ygl
 * @version V1.0
 * @since 2021-05-14 15:59
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Service1Bootstrap {

    public static void main(String[] args) {

        SpringApplication.run(Service1Bootstrap.class,args);
    }
}
