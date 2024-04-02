package com.example.demo;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopstestApplication implements CommandLineRunner {
	
	public static final Logger logger = LoggerFactory.getLogger(DevopstestApplication.class);

	public static void main(String[] args) {
		logger.info("its a continuous integration job....");
		SpringApplication.run(DevopstestApplication.class, args);
		System.out.println("Hello world!");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("its a second logger....")
		
	}

}
