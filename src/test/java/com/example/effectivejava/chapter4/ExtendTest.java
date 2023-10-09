package com.example.effectivejava.chapter4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExtendTest {

    @Test
    void addAllTest() {
        InstrumentHashSet<String> s = new InstrumentHashSet<>();
        s.addAll(List.of("A", "B", "C"));

        Assertions.assertThat(s.getAddCount()).isEqualTo(3);
    }
}
