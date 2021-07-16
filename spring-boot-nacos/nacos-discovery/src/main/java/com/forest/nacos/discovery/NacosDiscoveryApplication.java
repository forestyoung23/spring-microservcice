package com.forest.nacos.discovery;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NacosDiscoveryApplication {


    public static void main(String[] args) throws NacosException {
        SpringApplication.run(NacosDiscoveryApplication.class, args);
        NamingFactory.createNamingService("127.0.0.1:8848").registerInstance("nacos.test.3", "11.11.11.11", 8888, "TEST1");
    }

}
