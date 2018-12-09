package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
    public static Triangle getTriangle() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        return (Triangle)context.getBean("triangle");
    }
}
