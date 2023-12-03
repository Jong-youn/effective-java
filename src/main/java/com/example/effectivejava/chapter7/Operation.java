package com.example.effectivejava.chapter7;

public enum Operation {
    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }


    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x, double y);
}
