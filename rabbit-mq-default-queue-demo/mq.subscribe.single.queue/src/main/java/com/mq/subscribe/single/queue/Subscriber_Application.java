package com.mq.subscribe.single.queue;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Subscriber_Application {

	public static void main(String[] args) {
		//SpringApplication.run(Subscriber_Application.class, args);
		
		SpringApplication app=new SpringApplication(Subscriber_Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	
	}

}
