package com.forest.rabbit;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringRabbitApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void send() {
        System.err.println("发送消息");
        rabbitTemplate.convertAndSend("KISS_MY_ASS", "1234", "123123123123");
    }

}
