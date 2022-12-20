package com.example.service.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Component;

@Component
public class RabbitListener {
@org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "directQueue")
    public void receive( String id){

    System.out.println(" rabbit listener" + id );

    }
}
