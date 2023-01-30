package com.forest.rabbit.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Forest
 * @date 2020年09月23日 14:46
 */
@Component
@RabbitListener(queues = "chatbot")
public class Consumer {

    @RabbitHandler
    public void process(String s) {
        System.out.println("Receiver:" + s);
    }
}
