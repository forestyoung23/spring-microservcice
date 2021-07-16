package com.forest.rabbit.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Forest
 * @date 2020年09月23日 14:46
 */
@Component
public class Consumer {
    @RabbitHandler
    // @RabbitListener(bindings = @QueueBinding(value = @Queue("test"), exchange = @Exchange(name = "KISS_MY_ASS", type = ExchangeTypes.TOPIC)))
    @RabbitListener(queues = "test")
    public void receive(String msg) {
        System.err.println(msg);
    }
}
