// Copyright (C) 2021 Focus Media Holding Ltd. All Rights Reserved.

package com.ygl.microservice.service2.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * TODO
 *
 * @author ygl
 * @version V1.0
 * @since 2021-05-14 17:23
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Service2Bootstrap {

    public static void main(String[] args) {

        SpringApplication.run(Service2Bootstrap.class,args);
    }
}
