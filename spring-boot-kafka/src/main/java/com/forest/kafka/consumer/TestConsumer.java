package com.forest.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

/**
 *
 * @author Forest
 * @date 2021年07月13日 16:28
 */
public class TestConsumer {
    private static Properties getProperties() {
        Properties props = new Properties();
        // 服务端ip及端口
        props.setProperty("bootstrap.servers", "localhost:9092");
        // 消费者分组id
        props.setProperty("group.id", "test");
        // Consumer 在commit offset时有两种模式：自动提交，手动提交。
        // 手动提交。
        // 自动提交：是Kafka Consumer会在后台周期性的去commit。默认值是true。
        props.setProperty("enable.auto.commit", "true");
        // 自动提交间隔。范围：[0,Integer.MAX]，默认值是 5000 （5 s）
        // 消费者偏移的频率以毫秒为单位自动提交给Kafka，如果enable.auto.commit设置为true。
        props.setProperty("auto.commit.interval.ms", "1000");
        // 表示使用StringSerializer对key进行反序列化
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        // 表示使用StringSerializer对value进行反序列化
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        return props;
    }

    public static void testConsumer() {
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(getProperties());
        consumer.subscribe(Arrays.asList("Test"));
        while (true) {
            // 设置消费者在返回前等待的时间不超过100ms
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
            for (ConsumerRecord<String, String> record : records) {
                System.err.println("接收到消息：" + record.toString());
            }
        }
    }

    public static void main(String[] args) {
        testConsumer();
    }
}
