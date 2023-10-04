package com.example.effectivejava.chapter4;

public class Circle implements FigureV1{

    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }
}
