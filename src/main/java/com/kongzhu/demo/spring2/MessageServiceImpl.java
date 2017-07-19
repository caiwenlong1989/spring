package com.kongzhu.demo.spring2;

public class MessageServiceImpl implements MessageService {

    /**
     * 依赖的属性
     */
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
