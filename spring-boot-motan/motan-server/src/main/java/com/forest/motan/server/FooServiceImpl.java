package com.forest.motan.server;

import com.forest.service.FooService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * motan服务
 *
 * @author dongyang
 * @date 2021年07月06日 13:59
 */
@MotanService(export = "demoMotan:8002")
public class FooServiceImpl implements FooService {

	@Override
	public String test(String name) {
		return "this is demo, kill him ->" + name;
	}
}
