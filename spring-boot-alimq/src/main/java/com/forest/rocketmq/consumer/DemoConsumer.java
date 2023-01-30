package com.forest.rocketmq.consumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author Forest Dong
 * @date 2022年11月29日 09:51
 */
@Component
@RocketMQMessageListener(consumerGroup = "consumer-group", topic = "qwe")
public class DemoConsumer implements RocketMQListener<String> {
    public void onMessage(String message) {
        System.err.println("Recived message: " + message);
    }
}
