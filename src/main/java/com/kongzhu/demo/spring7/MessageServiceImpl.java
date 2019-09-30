package com.kongzhu.demo.spring7;

import com.kongzhu.demo.spring7.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 使用该注解，将当前类作为服务“Service”使用，并交由Spring管理
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public String getMessage() {
        return messageMapper.selectMessage();
    }

}
