package com.example.demo;



public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public String draw() {
        return "pointA is " + pointA.toString() +
                "\npointB is " + pointB.toString() +
                "\npointC is " + pointC.toString();
    }
}
