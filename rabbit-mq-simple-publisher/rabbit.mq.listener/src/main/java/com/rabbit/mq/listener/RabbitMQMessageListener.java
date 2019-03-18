package com.rabbit.mq.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		
		System.out.println("Message Received=  "+ new String(message.getBody()));
		
	}

}
