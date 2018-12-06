package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawingAppTests {

	@Test
	public void should_draw_a_triangle() {
		Triangle triangle = DrawingApp.getTriangle();
		assertEquals("Drawing triangle whose type is 20 and height is 0", triangle.draw());
	}
}
