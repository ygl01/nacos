// Copyright (C) 2021 Focus Media Holding Ltd. All Rights Reserved.

package com.ygl.microservice.application1.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ygl.microservice.service1.api.ConsumerService;


/**
 * TODO
 *
 * @author ygl
 * @version V1.0
 * @since 2021-05-14 15:09
 **/
@RestController
public class ApplicationController {

    //注入service(基于dubbo协议)
    @Reference
    ConsumerService consumerService;

    @GetMapping("/service")
    public String service() {

        String service = consumerService.service();
        return "test"+"；远程调用service1："+service;
    }

}
