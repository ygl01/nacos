package com.ygl.nacos;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * @author yangaoling
 * @version 1.0
 * @date 2021/4/30 14:50
 */
public class SimpleDemoMain {

    public static void main(String[] args) throws NacosException, InterruptedException {
        //使用nacos client 远程获取nacos服务上的配置信息
        //nacos地址+端口号
        String serverAddr = "49.235.125.139:8848";
        //nameSpace
        //注意namespace中的s是小写，千万不能写错，否则就不行
        String namespace = "b6cb281f-df22-4f43-9048-ff16ebcdec65";
        //data id
        String dataId = "nacos-simple-demo.yaml";
        //group
        String group = "DEFAULT_GROUP";

        Properties properties = new Properties();
        properties.put("serverAddr", serverAddr);
        properties.put("namespace", namespace);
        //获取配置
        ConfigService configService = NacosFactory.createConfigService(properties);
        //String dataId, String group, long timeoutMs
        String config = configService.getConfig(dataId, group, 5000);
        System.out.println("获取内容:" + config);
        //添加配置监听
        //String dataId, String group, Listener listener
        configService.addListener(dataId, group, new Listener() {
            @Override
            public Executor getExecutor() {

                return null;
            }

            //当配置有变化的时候获取通知
            @Override
            public void receiveConfigInfo(String s) {

                System.out.println("变化啦：" + s);
            }
        });

        //模拟监听（来个死循环）
        while (true) {
            //休眠两秒
            Thread.sleep(2000);
        }
    }

}
