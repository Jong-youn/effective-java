package com.example.effectivejava.chapter4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CustomCollectionTest {

    @Test
    void testBeforeRelease() {
        CustomCollection customCollection = new CustomCollection();
        customCollection.add("ValidElement");  // 특정 조건을 만족하는 원소 추가
        customCollection.add("AnotherValidElement");  // 특정 조건을 만족하는 원소 추가
        assertThatThrownBy(() -> customCollection.add("Invalid element"))  // 조건 불만족하는 원소 추가
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testAfterRelease() {
        CustomCollection customCollection = new CustomCollection();
        customCollection.add("ValidElement");  // 특정 조건을 만족하는 원소 추가
        customCollection.add("AnotherValidElement");  // 특정 조건을 만족하는 원소 추가
        customCollection.addOne("Invalid element");  // 조건 불만족하는 원소 추가

        Assertions.assertThat(customCollection.toString()).contains("Invalid element");
    }
}