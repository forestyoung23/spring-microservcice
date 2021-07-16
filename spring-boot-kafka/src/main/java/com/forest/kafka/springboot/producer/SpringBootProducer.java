//package com.forest.kafka.springboot.producer;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
//
///**
// * @author Forest
// * @date 2021年07月16日 16:15
// */
//@Slf4j
//@Component
//public class SpringBootProducer {
//    @Resource
//    private KafkaProducer producer;
//
//    public void publish(String topic, String key, String value) {
//        ProducerRecord record = new ProducerRecord<String, String>(topic, key, value);
//        producer.send(record);
//        log.info("send message successed, topic:{},key:{},value:{}", topic, key, value);
//    }
//}
