package com.forest.sleuth.contorller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Forest Dong
 * @date 2024年04月12日 11:54
 */
@RestController
public class TestController {
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test")
    public String test() {
        LOG.info("12344");
        LOG.info(MDC.get("traceId"));
        LOG.info(MDC.get("X-B3-TraceId"));
        return "test";
    }
}
