package com.kongzhu.demo.spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDAO messageDAO;

    @Override
    public String getMessage() {
        return messageDAO.selectMessage();
    }

}
