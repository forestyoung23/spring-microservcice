package com.forest.nacos.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author dongyang
 * @date 2021年07月08日 09:52
 */
@RestController
@RequestMapping("config")
public class NacosController {

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @GetMapping(value = "get")
    public boolean get() {
        return useLocalCache;
    }
}
