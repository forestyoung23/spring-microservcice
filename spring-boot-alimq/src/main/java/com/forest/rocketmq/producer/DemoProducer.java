package com.forest.rocketmq.producer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Forest Dong
 * @date 2022年11月29日 09:50
 */
@Component
public class DemoProducer {
    @Resource
    private RocketMQTemplate rocketMQTemplate;

    // 消息发送方法
    public void sendMessage(String topic, String msg){
        this.rocketMQTemplate.convertAndSend(topic, msg);
    }

}
