package com.example.effectivejava.chapter5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsTest {

    private int a;

    @Test
    void generics() {
        Object[] objectArray = new Long[1];
        objectArray[0] = "asdads"; // 런타임 에러
    }

    @Test
    void generics2() {
//        List<Object> ol = new ArrayList<Long>(); // 컴파일 수준 에러
//        ol.add(1L);

        List[] lists = new List[2];
        lists[0] = List.of(42);
        lists[1] = List.of("asd", "asdasd");
        System.out.println(lists[0]);
        System.out.println(lists[1]);

        List[] lists2 = new List[2];
        lists2[0] = List.of(42);
        lists2[1] = List.of("asd", "asdasd");
        System.out.println(lists2[0]);
        System.out.println(lists2[1]);

        List array1 = new ArrayList();
        int a = 1;
        array1.add(a);
        array1.add(true);
        System.out.println(array1.get(0).getClass());
        System.out.println(array1.get(1).getClass());
        System.out.println(a);
    }
}
