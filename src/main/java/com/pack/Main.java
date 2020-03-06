package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String... args) {
       // ApplicationContext xmlContext = new ClassPathXmlApplicationContext("app-config.xml");
    	ApplicationContext xmlContext = new AnnotationConfigApplicationContext(Config.class);
        Person person = xmlContext.getBean(Person.class);
        System.out.println(person);
    }
}
