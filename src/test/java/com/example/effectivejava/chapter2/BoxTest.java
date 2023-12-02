package com.example.effectivejava.chapter2;

import org.assertj.core.api.AssertDelegateTarget;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    void staticTest() {
        Box bear = Box.BEAR;
        int memory = System.identityHashCode(bear);
        System.out.println(memory);

        Box bear1 = Box.BEAR;
        int memory1 = System.identityHashCode(bear1);
        System.out.println(memory1);
        Assertions.assertThat(memory).isEqualTo(memory1);
    }

    @Test
    void nonStaticTest() {
        Box haribo = Box.HARIBO;
        int memory = System.identityHashCode(haribo);
        System.out.println(memory);

        Box haribo1 = Box.HARIBO;
        int memory1 = System.identityHashCode(haribo1);
        System.out.println(memory1);
        Assertions.assertThat(memory).isEqualTo(memory1);
    }

    @Test
    void sbClassTest() {
        Box box = Box.boxForKids();
        System.out.println(box.getClass());
        assertTrue(box instanceof Box);
    }
}