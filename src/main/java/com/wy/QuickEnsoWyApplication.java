package com.wy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.wy.dao")
public class QuickEnsoWyApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickEnsoWyApplication.class, args);
	}
}
