package com.forest.eurekaconsumer.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Forest
 * @date 2020年04月18日 14:59
 */
@Component
public class TestDiscoveryClient {

    @Autowired
    private DiscoveryClient discoveryClient;


    public void test() {
        List<InstanceInfo> instances = discoveryClient.getInstancesById("eurekaservice");
        System.err.println(instances.size());
    }
}
