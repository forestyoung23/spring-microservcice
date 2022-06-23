package com.forest.nacos.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Forest Dong
 * @date 2022年06月16日 10:41
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
    // @NacosValue()
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }
}
