package com.kongzhu.demo.spring;

public class MessageServiceImpl implements MessageService {

    private MessageDAO messageDAO;

    /**
     * 有参构造方法
     * @param messageDAO
     */
    public MessageServiceImpl(MessageDAO messageDAO) {
        this.messageDAO = messageDAO;
    }

    @Override
    public String getMessage() {
        return messageDAO.selectMessage();
    }

}
