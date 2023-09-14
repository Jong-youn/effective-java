package com.example.effectivejava.item1;

import org.junit.jupiter.api.Test;

import static com.example.effectivejava.item1.NyPizza.Size.LARGE;
import static com.example.effectivejava.item1.Pizza.Topping.*;
import static org.assertj.core.api.Assertions.assertThat;

class PizzaTest {

    @Test
    void makeCalzone() {
        Calzone calzone = new Calzone.Builder()
                .addTopping(MUSHROOM)
                .addTopping(ONION)
                .sauceInside()
                .build();

        assertThat(calzone.isSauceInside()).isTrue();
        assertThat(calzone.toppings).contains(ONION, MUSHROOM);
    }

    @Test
    void makeNyPizza() {
        NyPizza.Size size = LARGE;
        NyPizza nyPizza = new NyPizza.Builder(size)
                .addTopping(MUSHROOM)
                .addTopping(PEPPER)
                .build();

        assertThat(nyPizza.getSize()).isEqualTo(size);
        assertThat(nyPizza.toppings).contains(PEPPER, MUSHROOM);
    }
}