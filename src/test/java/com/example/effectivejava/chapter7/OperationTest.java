package com.example.effectivejava.chapter7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void test() {
        double apply = Operation.PLUS.apply(1, 2);
        System.out.println(apply);
    }

    @Test
    void test1() {
        double apply = Operation1.PLUS.apply(1, 2);
        System.out.println(apply);

        Operation1 plus = Operation1.PLUS;
        Operation1 minus = Operation1.MINUS;
        Operation1 plus1 = Operation1.PLUS;

        Assertions.assertThat(plus.equals(minus)).isFalse();
        Assertions.assertThat(plus.equals(plus1)).isTrue();
    }

    @Test
    void test2() {
        Collections.sort("asdasd", new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        Collections.sort("asdasd", (Comparator<String>) (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }
}