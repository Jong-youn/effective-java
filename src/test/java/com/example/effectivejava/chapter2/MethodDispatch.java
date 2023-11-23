package com.example.effectivejava.chapter2;

import org.junit.jupiter.api.Test;

import java.io.Serializable;

public class MethodDispatch {
    class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }

        void doTrick() {
            System.out.println("Dog performs a trick");
        }
    }

    @Test
    void test() {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();

        animal1.makeSound();  // Compile-time: Animal makes a sound
        animal2.makeSound();  // Compile-time: Dog barks (Runtime: Dynamic dispatch)

        // The following line will result in a compilation error
        // because the reference type (Animal) does not have a doTrick method.
//        animal2.doTrick();
    }
}
