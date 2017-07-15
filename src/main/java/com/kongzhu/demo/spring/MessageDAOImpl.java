package com.kongzhu.demo.spring;

public class MessageDAOImpl implements MessageDAO {

    @Override
    public String selectMessage() {
        return "Hello World!";
    }

}
