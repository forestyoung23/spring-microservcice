package com.forest.tacing.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Forest Dong
 * @date 2024年04月15日 17:51
 */
@RestController
@RequestMapping
public class TestController {
    private static final Log logger = LogFactory.getLog(TestController.class);
    @RequestMapping("test")
    public String test() {
        // 配置了在日志中输出 traceId
        logger.info("this is test log ....");
        return "SUCCESS";
    }

}
