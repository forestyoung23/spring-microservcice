package com.forest.eurekaservice.service.redislock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Forest
 * @date 2020年11月05日 02:14
 */
@Controller
public class RedisLockDemo {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/reduce")
    public String reduceStock() {
//        redisTemplate.opsForValue().setIfAbsent("")
        return "1";
    }
}
