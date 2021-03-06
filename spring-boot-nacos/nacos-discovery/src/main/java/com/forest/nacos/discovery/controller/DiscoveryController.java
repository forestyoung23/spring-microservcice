package com.forest.nacos.discovery.controller;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Forest
 * @date 2021年07月08日 11:08
 */
@RestController
@RequestMapping("discovery")
public class DiscoveryController {
    @NacosInjected
    private NamingService namingService;

    @GetMapping("get")
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        namingService.registerInstance("nacos.test.3", "11.11.11.11", 8888, "TEST1");
        return namingService.getAllInstances(serviceName);
    }

    public static void main(String[] args) throws NacosException {
        NamingService namingService = NacosFactory.createNamingService("127.0.0.1:8848");
    }
}
