// Copyright (C) 2021 Focus Media Holding Ltd. All Rights Reserved.

package com.ygl.microservice.service1.service;


import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

import com.ygl.microservice.service1.api.ConsumerService;
import com.ygl.microservice.service2.api.ProviderService;

/**
 * TODO
 *
 * @author ygl
 * @version V1.0
 * @since 2021-05-14 15:45
 **/
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference
    ProviderService providerService;

    /**
     * 实现service接口(dubbo接口实现内容)
     * TODO
     *
     * @param
     * @return String
     * @author ygl
     * @date 2021/5/14 15:46
     **/
    @Override
    public String service() {

        String service = providerService.service();
        return "Consumer invoke "+"；service1远程调用service2："+service;
    }

}
