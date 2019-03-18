package com.mq.publisher;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Publisher_Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Publisher_Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);

	}

}
