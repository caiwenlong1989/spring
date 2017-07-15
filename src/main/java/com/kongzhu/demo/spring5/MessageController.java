package com.kongzhu.demo.spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // 使用该注解，将当前类作为Spring组件使用，并交由Spring管理
public class MessageController {

    @Autowired // 使用该注解（可标记构造方法、属性、setter 方法或 config 方法），自动注入（装配）依赖
    private MessageService messageService;

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
