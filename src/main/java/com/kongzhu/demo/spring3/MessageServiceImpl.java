package com.kongzhu.demo.spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceImpl implements MessageService {

    private MessageDAO messageDAO;

    @Autowired
    public void setMessageDAO(MessageDAO messageDAO) {
        this.messageDAO = messageDAO;
    }

    @Override
    public String getMessage() {
        return messageDAO.selectMessage();
    }

}
