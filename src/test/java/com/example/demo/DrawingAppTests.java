package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

public class DrawingAppTests {

	@Test
	public void should_draw_a_triangle() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) context.getBean("triangle");
		assertEquals("Drawing triangle...\n" +
				"Point A = (0, 0)\n" +
				"Point B = (-20, 0)\n" +
				"Point C = (20, 0)\n", shape.draw());
	}

}
