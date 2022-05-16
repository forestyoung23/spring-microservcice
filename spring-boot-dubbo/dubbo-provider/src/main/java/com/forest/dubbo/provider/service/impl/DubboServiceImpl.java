package com.forest.dubbo.provider.service.impl;

import com.forest.dubbo.provider.service.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author Forest Dong
 * @date 2022年05月15日 14:31
 */
@Service
public class DubboServiceImpl implements DubboService {

    @Override
    public void fxx() {
        System.err.println("xxx");
    }
}
