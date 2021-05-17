package com.ygl.nacos.service2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangaoling
 * @version 1.0
 * @date 2021/4/30 17:16
 */
@RestController
public class TestController {

    @Value("${common.name}")
    private String config1;

    @GetMapping("/getConfigs")
    public String getConfigs(){
        return config1;
    }
}
