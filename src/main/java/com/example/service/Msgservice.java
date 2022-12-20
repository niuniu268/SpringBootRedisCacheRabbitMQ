package com.example.service;

import com.example.dao.Msg;

public interface Msgservice {


    String getCach(String id);
    boolean checkCach(String id, String code);
}
