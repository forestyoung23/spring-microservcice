package com.forest.eurekaservice.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dongyang
 * @date 2020年04月18日 14:59
 */
@RequestMapping("")
public class TestService {
    @RequestMapping("/test")
    public void test() {
        System.err.println("123");
    }
}
