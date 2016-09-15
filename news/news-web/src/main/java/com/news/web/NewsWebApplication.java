package com.news.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.news")
@EnableAutoConfiguration
public class NewsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsWebApplication.class, args);
	}
}
