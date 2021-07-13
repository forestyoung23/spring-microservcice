package com.forest.motan.client;

import com.forest.service.FooService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
		FooService service = (FooService) applicationContext.getBean("fooService");
		System.out.println(service.test("Forest"));
	}
}