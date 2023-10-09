package com.example.effectivejava.chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NestedClassTest {

    @Test
    void staticTest() {
//        OuterStatic outerStatic = new OuterStatic();
        OuterStatic.InnerStatic innerStatic = new OuterStatic.InnerStatic();
        innerStatic.getCode();
    }

    @Test
    void nonStaticTest() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.getCode();
//        new Outer().new Inner().getCode();
    }

    @Test
    void integerTest() {
        Integer i = 5;
        System.out.println(System.identityHashCode(i));
        i+=6;
        System.out.println(System.identityHashCode(i));

        String s = new String("string1");

    }
}