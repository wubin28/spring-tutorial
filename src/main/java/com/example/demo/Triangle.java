package com.example.demo;


import java.util.List;
import java.util.stream.Collectors;

public class Triangle {

    private List<Point> points;

    public void setPoints(List points) {
        this.points = points;
    }

    public String draw() {
        return points.stream().map(point -> point.toString()).collect(Collectors.joining());
    }
}
