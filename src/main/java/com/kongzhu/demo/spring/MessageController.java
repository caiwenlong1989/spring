package com.kongzhu.demo.spring;

public class MessageController {

    private MessageService messageService;

    /**
     * 有参构造方法
     * @param messageService
     */
    public MessageController(MessageService messageService) {
        super();
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
