package com.kongzhu.demo.spring2;

public class MessageController {

    private MessageService messageService;

    /**
     * messageService setter 方法
     * @param messageService
     */
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
