package com.example.effectivejava.chapter3;

import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.sql.Timestamp;

import static org.assertj.core.api.Assertions.assertThat;

class CaseInsensitiveStringTest {

    @Test
    void stringEquals() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

//        assertThat(cis.equals(s)).isTrue();
        assertThat(cis.equals(s)).isFalse();
        assertThat(s.equals(cis)).isFalse();
    }

    @Test
    void testSymmetryBetweenTimestampAndDate() {
        Timestamp timestamp = new Timestamp(1000);
        Date date = new Date(1000);

        // Timestamp 클래스 아니면 전부 false
        assertThat(timestamp.equals(date)).isFalse();
        assertThat(date.equals(timestamp)).isTrue();
        // 구체클래스를 확장하면서 대칭성 위배
    }

}