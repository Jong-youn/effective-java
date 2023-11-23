package com.example.effectivejava.chapter2;

public enum ElvisEnum {
    INSTANCE;

    public void getInfo() {
        System.out.println("singleton pattern test");
    }
}
