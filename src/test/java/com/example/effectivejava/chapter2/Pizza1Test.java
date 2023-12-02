package com.example.effectivejava.chapter2;

import org.junit.jupiter.api.Test;

import static com.example.effectivejava.chapter2.Pizza1.Topping.ONION;
import static com.example.effectivejava.chapter2.Pizza1.Topping.SAUSAGE;

class Pizza1Test {


    @Test
    void test() {
        Calzone1 calzone = new Calzone1.Builder()
                .sauceInside(true)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        System.out.println(calzone.toString());
    }
}