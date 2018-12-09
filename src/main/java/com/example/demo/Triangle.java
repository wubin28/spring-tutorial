package com.example.demo;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Triangle {

    private  Point pointA;
    private  Point pointB;
    private  Point pointC;

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

        List<Point> points = Arrays.asList(pointA, pointB, pointC);
        return points.stream().map(point -> point.toString()).collect(Collectors.joining());
    }
}
