package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawingAppTests {

	@Test
	public void should_draw_a_triangle() {
		Triangle triangle = new Triangle();
		assertEquals("Drawing triangle...\n", triangle.draw());
	}

}
