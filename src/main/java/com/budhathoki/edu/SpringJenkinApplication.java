package com.budhathoki.edu;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinApplication {
static Logger logger=(Logger) LoggerFactory.getLogger(SpringJenkinApplication.class);
@PostConstruct
public void intt() {
	logger.info("Application started....");
}
	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinApplication.class, args);
	}

}
