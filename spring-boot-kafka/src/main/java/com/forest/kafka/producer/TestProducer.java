package com.forest.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * @author Forest
 * @date 2021年07月13日 15:52
 */
public class TestProducer {
    private static Properties getProperties() {
        // 创建properties对象
        Properties props = new Properties();
        // 服务端ip及端口
        props.put("bootstrap.servers", "localhost:9092");
        /*
        指定了必须要有多少个分区副本收到消息，生产者才认为该消息是写入成功的，这个参数对于消息是否丢失起着重要作用，该参数的配置具体如下：
        - 0 : 表示生产者在成功写入消息之前不会等待任何来自服务器的响应. 换句话说，一旦出现了问题导致服务器没有收到消息，那么生产者就无从得知，消息也就丢失了.
              该配置由于不需要等到服务器的响应，所以可以以网络支持的最大速度发送消息，从而达到很高的吞吐量。
        - 1 : 表示只要集群的leader分区副本接收到了消息，就会向生产者发送一个成功响应的ack，此时生产者接收到ack之后就可以认为该消息是写入成功的.
              一旦消息无法写入leader分区副本(比如网络原因、leader节点崩溃),生产者会收到一个错误响应，当生产者接收到该错误响应之后，为了避免数据丢失，会重新发送数据.这种方式的吞吐量取决于使用的是异步发送还是同步发送.
        - all : 表示只有所有参与复制的节点(ISR列表的副本)全部收到消息时，生产者才会接收到来自服务器的响应.
                这种模式是最高级别的，也是最安全的，可以确保不止一个Broker接收到了消息. 该模式的延迟会很高.
        */
        props.put("acks", "all");
        // 表示使用StringSerializer对key进行序列化
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        // 表示使用StringSerializer对value进行序列化
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        return props;
    }

    public static void testPublish() {
        // 根据配置创建生产者
        KafkaProducer<Object, Object> producer = new KafkaProducer<>(getProperties());
        for (int i = 0; i < 100; i++) {
            ProducerRecord record = new ProducerRecord<>("Test", Integer.toString(i), Integer.toString(i));
            // 发送消息到指定Topic
            producer.send(record);
            System.err.println("发送消息成功：" + record.topic());
        }
        producer.close();
    }

    public static void main(String[] args) {
        testPublish();
    }
}
