package com.forest.tomcat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author Forest Dong
 * @date 2024年05月16日 15:42
 */
@Slf4j
@RestController
public class TestController {

    @GetMapping("test")
    public void test() throws InterruptedException {
        log.info("{} 接受到请求", Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(10);
    }
}
