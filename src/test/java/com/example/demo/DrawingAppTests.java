package com.example.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class DrawingAppTests {

	@Test
	public void should_draw_a_triangle() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = context.getBean("triangle", Triangle.class);
		assertEquals("Point{x=0, y=0}; Point{x=-20, y=0}; Point{x=20, y=0}; ", triangle.draw());
		((AbstractApplicationContext)context).close();
	}

	@Test
	public void the_bean_could_be_prototype_by_configuration() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = context.getBean("triangle", Triangle.class);
		triangle.changePointA(100, 100);
		Triangle theSameTriangle = context.getBean("triangle", Triangle.class);
		assertEquals("Point{x=0, y=0}; Point{x=-20, y=0}; Point{x=20, y=0}; ", theSameTriangle.draw());
		((AbstractApplicationContext)context).close();
	}
}
