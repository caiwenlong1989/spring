package com.kongzhu.demo.spring3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        MessageController controller;
        
        String configLocation = "com/kongzhu/demo/spring3/applicationContext.xml";
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        
        controller = context.getBean(MessageController.class);
        controller.printMessage();
        
        context.close();
    }

}
