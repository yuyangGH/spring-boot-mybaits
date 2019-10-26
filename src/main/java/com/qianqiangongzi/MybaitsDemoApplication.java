package com.qianqiangongzi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.qianqiangongzi.mapper")
@SpringBootApplication
public class MybaitsDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(MybaitsDemoApplication.class, args);
	}
}
