package com.kongzhu.demo.spring2;

public class MessageServiceImpl implements MessageService {

    private MessageDAO messageDAO;

    /**
     * messageDAO setter 方法
     * @param messageDAO
     */
    public void setMessageDAO(MessageDAO messageDAO) {
        this.messageDAO = messageDAO;
    }

    @Override
    public String getMessage() {
        return messageDAO.selectMessage();
    }

}
