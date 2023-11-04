package com.example.effectivejava.chapter9;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {

    RandomNumber randomNumber;

    @Test
    void randomTest() {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1000000; i++) {
            if (randomNumber.random(n) < n/2)
                low++;
        }
        System.out.println(low);
    }

    @Test
    void randomTest2() {
        Random random = new Random();
        System.out.println(Math.abs(random.nextInt()) % 5);
        System.out.println(Math.abs(random.nextInt()) % 5);
        System.out.println(Math.abs(random.nextInt()) % 5);
    }
}