package com.kongzhu.demo.spring5;

import org.springframework.stereotype.Repository;

@Repository
public class MessageDAOImpl implements MessageDAO {

    @Override
    public String selectMessage() {
        return "Hello World!";
    }

}
