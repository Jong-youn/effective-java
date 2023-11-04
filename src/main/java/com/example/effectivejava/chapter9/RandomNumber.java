package com.example.effectivejava.chapter9;

import java.util.Random;

public class RandomNumber {

    static Random rnd = new Random();

    static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }
}
