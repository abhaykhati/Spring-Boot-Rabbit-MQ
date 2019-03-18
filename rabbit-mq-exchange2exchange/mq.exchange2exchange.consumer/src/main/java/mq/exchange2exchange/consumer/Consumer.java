package mq.exchange2exchange.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import mq.exchange2exchange.consumer.model.Log;
 
@Component
public class Consumer {
	
    @RabbitListener(queues="${jsa.rabbitmq.queue}", containerFactory="jsaFactory")
    public void recievedMessage(Log logs) {
        System.out.println("Recieved Message: " + logs);
    }
}