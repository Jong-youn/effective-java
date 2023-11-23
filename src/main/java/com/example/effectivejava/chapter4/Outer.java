package com.example.effectivejava.chapter4;

import java.util.HashMap;
import java.util.Set;

public class Outer {
    public Outer() {
        System.out.println("Outer");
    }

    private static String staticCode = "static";
    private String nonStaticCode = "nonStatic";

    public class Inner {

        public Inner() {
            System.out.println("Inner - Nonstatic");
        }

        public void getCode() {
            System.out.println(staticCode);
            System.out.println(nonStaticCode);
        }
    }

    public static class StaticInner {

        public StaticInner() {
            System.out.println("Inner - Static");
            Set set = new HashMap().keySet();
        }

        public void getCode() {
            System.out.println(staticCode);
//            System.out.println(nonStaticCode);  바깥 클래스의 인스턴스 필드 접근 불가
        }
    }
}
