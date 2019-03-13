package com.lahand.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.lahand.mapper")
@ComponentScan("com.lahand.*")
public class LahandMarkdownApplication {

	public static void main(String[] args) {
		SpringApplication.run(LahandMarkdownApplication.class, args);
	}

}
