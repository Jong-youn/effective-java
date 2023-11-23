package com.example.effectivejava.chapter2;

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    // don't let instantiate this class
    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void getInfo() {
        System.out.println("singleton pattern test");
    }
}
