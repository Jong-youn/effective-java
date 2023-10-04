package com.example.effectivejava.chapter4;

public class Outer {
    public Outer() {
        System.out.println("Outer");
    }

    private static String staticCode = "static";
    private String nonStaticCode = "nonStatic";

    public class Inner {

        public Inner() {
            System.out.println("Inner");
        }

        public void getCode() {
            System.out.println(staticCode);
            System.out.println(nonStaticCode);
        }
    }
}
