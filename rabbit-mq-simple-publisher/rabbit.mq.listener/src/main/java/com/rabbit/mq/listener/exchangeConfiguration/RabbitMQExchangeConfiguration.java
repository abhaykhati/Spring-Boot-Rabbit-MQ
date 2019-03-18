package com.rabbit.mq.listener.exchangeConfiguration;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfiguration {
	
	@Bean
	Exchange exampleExchange() {
		return new TopicExchange("exampleExchange");
	}
	
	@Bean
	Exchange exchangeBuilderExchange() {
		return ExchangeBuilder.directExchange("DirectExchangeWithBuilder")
				.autoDelete()
				.internal()
				.build();
	}

}
