package com.forest.kafka.springboot;

import com.forest.kafka.springboot.producer.SpringBootProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Forest
 * @date 2021年07月16日 11:56
 */
@SpringBootApplication
public class SpringBootKafkaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootKafkaApplication.class, args);
        SpringBootProducer springBootProducer = (SpringBootProducer) applicationContext.getBean("springBootProducer");
        springBootProducer.publish("test", "forest", "kiss my ass");
    }

}
