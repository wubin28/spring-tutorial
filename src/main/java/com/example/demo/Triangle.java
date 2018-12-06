package com.example.demo;


public class Triangle {
    private String type;
    private int height;

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String draw() {
        return "Drawing triangle whose type is " + type + " and height is " + height;
    }
}
