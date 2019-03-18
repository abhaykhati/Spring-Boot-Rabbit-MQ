package com.mq.publisher;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Publisher {
	@Autowired
	private AmqpTemplate amqpTemplate;

	@Value("${jsa.rabbitmq.exchange}")
	private String exchange;

	public void produceMsg(String msg) {
		amqpTemplate.convertAndSend(exchange, "", msg);
		System.out.println("Sent msg from produceMsg()  = " + msg);
	}
}
