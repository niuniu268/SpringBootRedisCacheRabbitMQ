package com.example.service;


import com.example.dao.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MsgserviceImpl implements Msgservice{


    HashMap<String, String> cache = new HashMap <>(  );
    @Autowired
    MsgUtl msgUtl;


    @Override
    @CachePut(value = "sms", key = "#id" )
    public String getCach( String id) {

        String code = id + "test";

        return code;
    }

    @Override
    public boolean checkCach( String id, String code) {
        String s = msgUtl.getFromRedis( id );
        return code.equals( s );
    }

}
