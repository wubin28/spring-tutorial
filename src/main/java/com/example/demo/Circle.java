package com.example.demo;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Required
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String draw() {
        return "Drawing circle...\n" +
                "Center = (" + center.getX() + ", " + center.getY() + ")\n";
    }
}
