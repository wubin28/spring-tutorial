package com.example.demo;


public class Triangle implements Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    @Override
    public String draw() {
        return "Drawing triangle...\n" +
                "Point A = (" + pointA.getX() + ", " + pointA.getY() + ")\n" +
                "Point B = (" + pointB.getX() + ", " + pointB.getY() + ")\n" +
                "Point C = (" + pointC.getX() + ", " + pointB.getY() + ")\n";
    }
}
