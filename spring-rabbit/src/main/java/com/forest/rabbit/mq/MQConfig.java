package com.forest.rabbit.mq;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dongyang
 * @date 2020年09月22日 16:24
 */
@Configuration
public class MQConfig {
    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("KISSMYASS");
    }
}
