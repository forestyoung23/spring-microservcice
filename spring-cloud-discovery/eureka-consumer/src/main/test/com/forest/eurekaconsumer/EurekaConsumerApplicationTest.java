package com.forest.eurekaconsumer;

import com.forest.eurekaconsumer.controller.TestDiscoveryClient;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class EurekaConsumerApplicationTest {

    @Autowired
    private TestDiscoveryClient discoveryClient;

    @Test
    public void test1() {
        discoveryClient.test();
    }

}
