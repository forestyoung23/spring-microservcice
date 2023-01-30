package com.forest.rocketmq.controller;

import com.forest.rocketmq.producer.DemoProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Forest Dong
 * @date 2022年11月29日 10:14
 */
@RestController
@RequestMapping("send")
public class SendController {
    @Value("${test.config}")
    private String config;

    @Resource
    private DemoProducer producer;

    @PostMapping("msg")
    public void sendMsg() {
        producer.sendMessage("qwe", "123");
        System.err.println("消息发送成功");
    }

    @GetMapping("config")
    public String config() {
        return config;
    }
}
