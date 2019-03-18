package com.mq.subscribe.single.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
 
	@RabbitListener(queues="${rabbitmq.direct.queue}")
    public void recievedMessage(String msg) {
        System.out.println("Recieved Message: " + msg);
    }
}