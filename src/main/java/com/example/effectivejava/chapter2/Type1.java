package com.example.effectivejava.chapter2;

import java.sql.SQLOutput;

public interface Type1 {

    static void method1() {
        System.out.println("type1 - static method");
    }

    default void eat() {
        System.out.println("type1 - defualt method");
    }

    default void create() {
        System.out.println("type1");
    }

    String read();
}
