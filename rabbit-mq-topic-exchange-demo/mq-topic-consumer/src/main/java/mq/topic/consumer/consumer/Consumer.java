package mq.topic.consumer.consumer;

import org.apache.commons.logging.Log;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
 
 
@Component
public class Consumer {
	
	@RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="jsaFactory")
    public void recievedMessage(Log logs) {
        System.out.println("Recieved Message: " + logs);
    }
}