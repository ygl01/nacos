// Copyright (C) 2021 Focus Media Holding Ltd. All Rights Reserved.

package com.ygl.microservice.service2.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.ygl.microservice.service2.api.ProviderService;

/**
 * TODO
 *
 * @author ygl
 * @version V1.0
 * @since 2021-05-14 17:15
 **/
@Service
public class ProvicerServiceImpl implements ProviderService {

    @Override
    public String service() {

        return "Provider invoke";
    }

}
