package com.example.service.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsgRabbit implements MessageService{
    @Autowired
    private AmqpTemplate template;

    @Override
    public void sendMsg(String id) {
        System.out.println("test exchange" );
        template.convertAndSend( "directExchange","direct", id );

    }

    @Override
    public String doMsg() {
        return null;
    }
}
