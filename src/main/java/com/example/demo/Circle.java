package com.example.demo;

public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle...");
        System.out.println("Center = (" + center.getX() + ", " + center.getY() + ")");
    }
}
