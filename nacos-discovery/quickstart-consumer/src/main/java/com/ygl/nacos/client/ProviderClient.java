package com.ygl.nacos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 发现生产者服务 feign
 *
 * @author yangaoling
 * @version 1.0
 * @date 2021/5/13 17:58
 */
@FeignClient("quickstart-provider")
public interface ProviderClient {

    @GetMapping("/service")
    public String service();

}
