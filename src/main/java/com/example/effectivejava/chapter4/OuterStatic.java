package com.example.effectivejava.chapter4;

public class OuterStatic {

    public OuterStatic() {
        System.out.println("OuterStatic");
    }

    private static String staticCode = "static";
    private String nonStaticCode = "nonStatic";


    public static class InnerStatic {
        public InnerStatic() {
            System.out.println("InnerStatic");
        }

        public void getCode() {
            System.out.println(staticCode);
//            System.out.println(nonStaticCode);
            System.out.println();
        }
    }
}
