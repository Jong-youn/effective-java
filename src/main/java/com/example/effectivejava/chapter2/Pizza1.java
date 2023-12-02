package com.example.effectivejava.chapter2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza1 {

    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza1 build();

        // 객체 내부에서만 쓸 메서드
        protected abstract T self();
    }

    Pizza1(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
