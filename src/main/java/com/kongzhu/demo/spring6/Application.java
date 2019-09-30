package com.kongzhu.demo.spring6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        String configLocation = "com/kongzhu/demo/spring6/applicationContext.xml";
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        MessageController controller = context.getBean(MessageController.class);
        controller.printMessage();

        context.close();
    }

}
