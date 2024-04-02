package com.forest.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * redis服务
 *
 * @author Forest Dong
 * @date 2024年04月02日 21:26
 */
@Service
public class RedisService {
    @Autowired
    private StringRedisTemplate redisTemplate;

    public void setKey(String key) {
        redisTemplate.opsForValue().set(key, "value");
    }

    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
