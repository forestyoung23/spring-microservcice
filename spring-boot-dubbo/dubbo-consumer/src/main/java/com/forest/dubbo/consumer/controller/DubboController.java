package com.forest.dubbo.consumer.controller;

import com.forest.dubbo.consumer.service.DubboService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Forest Dong
 * @date 2022年05月15日 14:33
 */
@RestController
public class DubboController {
    @Resource
    private DubboService dubboService;
}
