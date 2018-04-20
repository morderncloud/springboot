package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BluebootApplication extends SpringBootServletInitializer{

	/**
	 * JAR
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BluebootApplication.class, args);
	}
	
	/**
	 * WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BluebootApplication.class);
	}
}
