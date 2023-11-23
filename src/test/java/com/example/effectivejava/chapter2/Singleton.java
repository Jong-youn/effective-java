package com.example.effectivejava.chapter2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class Singleton {

//    @Test
//    void singletonTest() {
//        Elvis elvis1 = Elvis.INSTANCE;
//        Elvis elvis2 = Elvis.INSTANCE;
//
//        System.out.println(elvis1.toString());
//        System.out.println(elvis2.toString());
//        Assertions.assertThat(elvis1.equals(elvis2)).isTrue();
//    }

    @Test
    void singletonTest2() {
        Elvis elvis1 = Elvis.getInstance();
        Elvis elvis2 = Elvis.getInstance();

        System.out.println(elvis1.toString());
        System.out.println(elvis2.toString());
        Assertions.assertThat(elvis1.equals(elvis2)).isTrue();
    }

    @Test
    void enumType() {
        ElvisEnum elvis1 = ElvisEnum.INSTANCE;
        ElvisEnum elvis2 = ElvisEnum.INSTANCE;

        System.out.println(elvis1.toString());
        System.out.println(elvis2.toString());
        Assertions.assertThat(elvis1.equals(elvis2)).isTrue();
    }


    @Test
    void singletonTest3() {
        Supplier<Elvis> elvisSupplier = () -> {
            System.out.println("start");
            return Elvis.getInstance();
        };

        Elvis elvis1 = elvisSupplier.get();
        Elvis elvis2 = elvisSupplier.get();

        System.out.println(elvis1.toString());
        System.out.println(elvis2.toString());
        Assertions.assertThat(elvis1.equals(elvis2)).isTrue();
    }
}