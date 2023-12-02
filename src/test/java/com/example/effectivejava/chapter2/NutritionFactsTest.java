package com.example.effectivejava.chapter2;

import org.junit.jupiter.api.Test;

class NutritionFactsTest {

    @Test
    void test() {
        NutritionFacts food = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        System.out.println(food.toString());
    }
}