package com.kongzhu.demo.spring2;

public class MessageDAOImpl implements MessageDAO {

    @Override
    public String selectMessage() {
        return "Hello World!";
    }

}
