package com.forest.rabbit.mq;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dongyang
 * @date 2020年09月22日 16:24
 */
@Configuration
public class MQConfig {

    @Bean
    public Queue queue() {
        return new Queue("test");
    }

    @Bean
    public TopicExchange testExchange() {
        return new TopicExchange("KISS_MY_ASS");
    }

    @Bean
    public Binding bind() {
        return BindingBuilder.bind(queue()).to(testExchange()).with("*");
    }
}
