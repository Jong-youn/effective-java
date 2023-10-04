package com.example.effectivejava.chapter4;

public class FigureV0 {
    enum Shape { RECTANGLE, CIRCLE };

    final Shape shape;

    double length;
    double width;

    double radius;

    FigureV0(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    FigureV0(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (shape) {
            case RECTANGLE:
                return length*width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}
