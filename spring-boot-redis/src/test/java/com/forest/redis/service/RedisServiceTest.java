package com.forest.redis.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisServiceTest {
    @Autowired
    RedisService redisService;

    @Test
    void testSetKey() {
        redisService.setKey("qwsdsdg");
    }

    @Test
    void testGet() {
        System.err.println(redisService.get("qwsdsdg"));
        System.err.println(redisService.get("qwsdsdg"));
        System.err.println(redisService.get("qwsdsdg"));
        System.err.println(redisService.get("qwsdsdg"));
        System.err.println(redisService.get("qwsdsdg"));
        System.err.println(redisService.get("qwsdsdg"));
    }
}