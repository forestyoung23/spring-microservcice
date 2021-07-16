package com.forest.kafka.springboot;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * @author Forest
 * @date 2021年07月16日 11:56
 */
@Slf4j
@SpringBootApplication
public class SpringBootKafkaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootKafkaApplication.class, args);
//        SpringBootProducer springBootProducer = (SpringBootProducer) applicationContext.getBean("springBootProducer");
//        springBootProducer.publish("test", "forest", "kiss my ass");
    }

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("topic1")
                .partitions(10)
                .replicas(1)
                .build();
    }

    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> template) {
        return  args -> {
            for (int i = 0; i < 10; i++) {
                template.send("topic1", "test");
                log.info("send message successed");
            }
        };
    }

//    @Bean
//    public NewTopic topic() {
//        return TopicBuilder.name("topic1")
//                .partitions(10)
//                .replicas(1)
//                .build();
//    }

    @KafkaListener(id = "myId", topics = "topic1")
    public void listen(String in) {
        System.err.println(in);
    }


}
