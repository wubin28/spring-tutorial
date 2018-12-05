package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
    public static Triangle getTriangle() {
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("/Users/binwu/OOR/katas/remote/spring-tutorial/demo/src/main/resources/spring.xml"));
        return  (Triangle)factory.getBean("triangle");
    }
}
