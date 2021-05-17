package com.ygl.nacos.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangaoling
 * @version 1.0
 * @date 2021/4/30 17:16
 */
@RestController
public class TestController {

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Value("${common.name}")
    private String config1;

    @GetMapping("/getConfigs")
    public String getConfigs() {
        return applicationContext.getEnvironment().getProperty("common.name");
    }

    @GetMapping(value = "/config2")
    public String getConfig2() {
        String name = applicationContext.getEnvironment().getProperty("common.name");
        String age = applicationContext.getEnvironment().getProperty("common.age");
        String address = applicationContext.getEnvironment().getProperty("common.address");
        String birthday = applicationContext.getEnvironment().getProperty("common.birthday");
        String fullname = applicationContext.getEnvironment().getProperty("common.fullname");
        String schoolname = applicationContext.getEnvironment().getProperty("common.school");
        return name + "+" + age + "+" + address + "+" + birthday + "+" + fullname + "+" + schoolname;
    }
}
