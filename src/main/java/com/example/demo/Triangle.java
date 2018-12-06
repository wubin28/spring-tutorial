package com.example.demo;


public class Triangle {
    private String type;

    public Triangle(String type) {
        this.type = type;
    }

    public String draw() {
        return "Drawing triangle whose type is " + type;
    }
}
