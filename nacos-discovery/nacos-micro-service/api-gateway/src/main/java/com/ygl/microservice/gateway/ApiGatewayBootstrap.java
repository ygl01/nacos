// Copyright (C) 2021 Focus Media Holding Ltd. All Rights Reserved.

package com.ygl.microservice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * TODO
 *
 * @author ygl
 * @version V1.0
 * @since 2021-05-14 18:27
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApiGatewayBootstrap {

    public static void main(String[] args) {

        SpringApplication.run(ApiGatewayBootstrap.class, args);
    }

}
