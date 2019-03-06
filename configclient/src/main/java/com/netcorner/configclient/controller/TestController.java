package com.netcorner.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shijiufeng on 2019/2/26.
 */
@RestController
@RefreshScope //通过刷新配置中心链接 就可以自动更新配置文件了http://localhost:8003/actuator/refresh
public class TestController {

    @Value("${netcorner}")
    private String testConfigKey;

    @RequestMapping("/getKey")
    public String getKey(){
        return testConfigKey;
    }
}
