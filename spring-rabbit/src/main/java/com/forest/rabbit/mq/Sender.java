package com.forest.rabbit.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Forest
 * @date 2020年09月22日 17:07
 */
@Component
public class Sender {

    public static final String QUEUENAME = "chatbot";

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender:" + context);
        this.rabbitTemplate.convertAndSend(QUEUENAME, context);
    }
}

