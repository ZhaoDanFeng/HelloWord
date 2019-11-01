package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* HelloSpringBoot
* @author yongxi
* @E-mail yongxi@chaoxing.com
* @date   2019年9月26日 下午3:48:46 
*/
@RestController
public class HelloSpringBoot {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Spring Boot";
	}

	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;

	@RequestMapping("/getUser")
	public String getUser() {
		return "name: " + name + ";age:" + age;
	}

}
 