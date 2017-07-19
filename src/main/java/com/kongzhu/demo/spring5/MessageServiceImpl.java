package com.kongzhu.demo.spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 使用该注解，将当前类作为服务“Service”使用，并交由Spring管理
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDAO messageDAO;

    @Override
    public String getMessage() {
        return messageDAO.selectMessage();
    }

}
