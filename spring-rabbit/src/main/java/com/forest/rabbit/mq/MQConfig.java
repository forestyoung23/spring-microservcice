package com.forest.rabbit.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Forest
 * @date 2020年09月22日 16:24
 */
@Configuration
public class MQConfig {

    public static final String QUEUENAME = "chatbot";

    @Bean
    public Queue helloQueue() {
        return new Queue(QUEUENAME);
    }
}
