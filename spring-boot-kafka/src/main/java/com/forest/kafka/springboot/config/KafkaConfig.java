package com.forest.kafka.springboot.config;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 这里直接创建KafkaProducer,也可直接使用spring-kafka提供的KafkaTemplate
 *
 * @author Forest
 * @date 2021年07月16日 11:56
 */
@Configuration
@EnableConfigurationProperties(KafkaProperties.class)
public class KafkaConfig {
    @Bean
    public KafkaProducer kafkaProducer(KafkaProperties properties) {
        return new KafkaProducer<>(getProperties(properties));
    }

    private Properties getProperties(KafkaProperties properties) {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, properties.getBootstrapServers());
        props.put(ProducerConfig.ACKS_CONFIG, properties.getAcks());
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, properties.getKeySerializer());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, properties.getValueSerializer());
        return props;
    }
}
