package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawingAppTests {

	@Test
	public void should_draw_a_triangle() {
		Triangle triangle = DrawingApp.getTriangle();
		assertEquals("pointA is Point{x=0, y=0}\n" +
				"pointB is Point{x=-20, y=0}\n" +
				"pointC is Point{x=20, y=0}", triangle.draw());
	}
}
