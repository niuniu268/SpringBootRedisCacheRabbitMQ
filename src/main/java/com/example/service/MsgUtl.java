package com.example.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class MsgUtl {


    @Cacheable(value = "sms", key="#id")
    public String getFromRedis(String id){


        return  null;

    }
}
