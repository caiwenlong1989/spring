package com.kongzhu.demo.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        MessageController controller;
//        
//        MessageDAO messageDAO = new MessageDAOImpl();;
//        MessageService messageService = new MessageServiceImpl(messageDAO);
//        controller = new MessageController(messageService);
        
        String configLocation = "com/kongzhu/demo/spring/applicationContext.xml";
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        
        controller = context.getBean(MessageController.class);
        controller.printMessage();
        
        context.close();
    }

}
