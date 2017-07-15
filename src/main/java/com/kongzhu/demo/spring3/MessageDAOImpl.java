package com.kongzhu.demo.spring3;

import org.springframework.stereotype.Component;

@Component
public class MessageDAOImpl implements MessageDAO {

    @Override
    public String selectMessage() {
        return "Hello World!";
    }

}
