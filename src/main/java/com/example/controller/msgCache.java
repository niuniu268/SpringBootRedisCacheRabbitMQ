package com.example.controller;

import com.example.dao.Msg;
import com.example.service.Msgservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msg")
public class msgCache {

    @Autowired
    private Msgservice msgservice;


    @GetMapping
    String inputMessage(String id){

        return  msgservice.getCach( id.toString() );

    }
    @PostMapping
    Boolean checkMessage(Msg msg){
        System.out.println( msg.getId() +"  "+ msg.getCode());

        return msgservice.checkCach( msg.getId(),  msg.getCode() );

    }
}
