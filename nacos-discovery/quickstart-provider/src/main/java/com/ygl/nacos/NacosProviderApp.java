package com.ygl.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yangaoling
 * @version 1.0
 * @date 2021/5/13 17:45
 */
@SpringBootApplication
//开启服务发现客户端 和@EnableEurekaClient注解一样功能 都是能够让注册中心能够发现，扫描到该服务。
@EnableDiscoveryClient
//启用feign客户端
@EnableFeignClients
public class NacosProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApp.class, args);
    }

}
