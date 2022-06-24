package com.forest.nacos.server.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Forest Dong
 * @date 2022年06月24日 11:03
 */
@RestController
@RequestMapping("server")
public class ServerController {
    @PostMapping("test")
    public void test() {
        System.err.println("server被调用");
    }
}
