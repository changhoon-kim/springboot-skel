package com.worksmobile.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MytestApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(MytestApplication.class, args);
	}
}
