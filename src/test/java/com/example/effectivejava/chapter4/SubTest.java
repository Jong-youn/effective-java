package com.example.effectivejava.chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubTest {

    @Test
    void test() {
        Sub sub = new Sub();
        System.out.println("--------------");
        sub.overrideMe();
    }
}