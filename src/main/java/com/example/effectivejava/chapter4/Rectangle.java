package com.example.effectivejava.chapter4;

public class Rectangle implements FigureV1{

    final double length;
    final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        Singer wp = new Wp();
        Integer i = 5;
        i+=6;
        return length*width;
    }
}
