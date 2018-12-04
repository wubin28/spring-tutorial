package com.example.demo;


public class Triangle implements Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle() {
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
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
