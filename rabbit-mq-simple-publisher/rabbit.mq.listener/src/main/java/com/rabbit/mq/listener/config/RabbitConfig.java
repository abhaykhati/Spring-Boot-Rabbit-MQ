package com.rabbit.mq.listener.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rabbit.mq.listener.RabbitMQMessageListener;

@Configuration
public class RabbitConfig {
	
	private static final String Queue_Name="abhayQueue";
	
	@Bean
	Queue buildQueue() {
		
		return  new Queue(Queue_Name,true);
	}
	@Bean
	ConnectionFactory connectionFactory() {
		CachingConnectionFactory cachingConnectionFactory=new CachingConnectionFactory("localhost");
		cachingConnectionFactory.setUsername("guest");
		cachingConnectionFactory.setPassword("guest");
		return cachingConnectionFactory;
	}

	@Bean
	MessageListenerContainer messageListenerContainer() {
		SimpleMessageListenerContainer simpleMessageListenerContainer=new SimpleMessageListenerContainer(connectionFactory());
		simpleMessageListenerContainer.setQueues(buildQueue());
		simpleMessageListenerContainer.setMessageListener(new RabbitMQMessageListener());
		return simpleMessageListenerContainer;
	}
	
	
}
