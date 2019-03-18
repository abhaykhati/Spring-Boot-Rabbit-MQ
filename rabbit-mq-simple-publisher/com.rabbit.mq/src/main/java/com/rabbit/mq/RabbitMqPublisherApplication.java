package com.rabbit.mq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqPublisherApplication implements CommandLineRunner {
	@Autowired
	RabbitTemplate rabbitTemplate;
	

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqPublisherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleMessage message=new SimpleMessage();
		message.setName("Abhay as a Name");
		message.setDescription("Abhay's Description");
		
		rabbitTemplate.convertAndSend("TestExchange", "testRoutingKey", message);
		
		
		
	}

}
