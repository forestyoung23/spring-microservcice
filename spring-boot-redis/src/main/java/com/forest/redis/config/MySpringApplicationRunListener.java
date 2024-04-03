package com.forest.redis.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author Forest Dong
 * @date 2024年04月03日 17:11
 */
public class MySpringApplicationRunListener implements SpringApplicationRunListener {
    private static final Logger log = LoggerFactory.getLogger(MySpringApplicationRunListener.class);
    // 这个构造函数不能少，否则反射生成实例会报错
    public MySpringApplicationRunListener(SpringApplication sa, String[] args) {
    }
    @Override
    public void starting(ConfigurableBootstrapContext context) {
        System.err.println("starting:" +  LocalDateTime.now());
    }
    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.err.println("environmentPrepared:" +   LocalDateTime.now());
    }
    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.err.println("contextPrepared:" +  LocalDateTime.now());
    }
    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.err.println("contextLoaded:" +  LocalDateTime.now());
    }
    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        System.err.println("started:" +  LocalDateTime.now());
    }
    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.err.println("failed:" +  LocalDateTime.now());
    }
}
