package com.forest.nacos.client.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Forest Dong
 * @date 2022年06月24日 11:03
 */
@RestController
@RequestMapping("client")
public class ClientController {
    @PostMapping("test")
    public void test() {
        System.err.println("client被调用");
    }
}
