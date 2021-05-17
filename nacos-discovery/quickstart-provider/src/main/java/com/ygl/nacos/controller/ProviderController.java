package com.ygl.nacos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 生产者controller层
 *
 * @author yangaoling
 * @version 1.0
 * @date 2021/5/13 17:34
 */
@RestController
public class ProviderController {

    //添加打印日志
    private static final Logger LOG = LoggerFactory.getLogger(ProviderController.class);

    /**
     * 测试
     *
     * @Author: ygl
     * @Date: 2021/5/13
     */
    @GetMapping("/service")
    public String service() {
        LOG.info("provider invoke");
        return "provider invoke";
    }

}
