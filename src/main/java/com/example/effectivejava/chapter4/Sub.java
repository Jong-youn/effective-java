package com.example.effectivejava.chapter4;

import java.time.Instant;

public class Sub extends Super {
    private final Instant instant;

    Sub() {
        instant = Instant.now();
        System.out.println("sub: " + instant);
    }

    /**
     * @implSpec
     * 생성자에서 오버라이딩메서드 쓰지 마시오!
     */
    @Override
    public void overrideMe() {
        System.out.println("Sub - overrideme");
        System.out.println(instant);
    }
}
