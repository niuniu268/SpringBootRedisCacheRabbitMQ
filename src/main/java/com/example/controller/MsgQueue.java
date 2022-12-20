package com.example.controller;

import com.example.service.rabbitmq.MsgRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/que")
public class MsgQueue {
    @Autowired
    private MsgRabbit msgRabbit;


    @PostMapping
    public String queue( String id){
        msgRabbit.sendMsg( id );
        return  id;
    }




}
