package com.example.demo;


public class Triangle {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String draw() {
        return "Drawing triangle whose type is " + type;
    }
}
