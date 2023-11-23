package com.example.effectivejava.chapter2;

public interface Type2 {

    static void method1() {
        System.out.println("type2 - static method");
    }

    void eat();

    default void create() {
        System.out.println("type2");
    }

    String read();
}
