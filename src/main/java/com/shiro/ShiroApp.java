package com.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 作者：administrator
 * 时间：2019年5月5日 下午3:21:17
 * 说明：
 */
@SpringBootApplication
@MapperScan(value = "com.shiro.mapper")
public class ShiroApp {
	public static void main(String[] args) {
		SpringApplication.run(ShiroApp.class, args);
	}
}
