package com.kongzhu.demo.spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 使用该注解，将当前类作为组件“component”使用，并交由Spring管理
public class MessageController {

    /**
     * 依赖的属性
     */
    private MessageService messageService;

    @Autowired // 使用该注解（可标记构造方法、属性、setter 方法或 config 方法），自动注入（装配）依赖
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
