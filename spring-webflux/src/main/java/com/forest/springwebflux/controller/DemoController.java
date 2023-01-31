package com.forest.springwebflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * @author Forest Dong
 * @date 2023年01月31日 10:50
 */
@RestController
public class DemoController {

    @GetMapping("flux")
    public Mono<String> demo() {
        return Mono.delay(Duration.ofMillis(10)).thenReturn("qwe");
    }

    @GetMapping("mvc")
    public String hello() throws InterruptedException {
        Thread.sleep(10);
        return "qwe";
    }
}
