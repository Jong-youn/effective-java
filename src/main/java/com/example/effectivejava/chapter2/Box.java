package com.example.effectivejava.chapter2;

public class Box {

    public static final Box BEAR = new Box("bear");
    public static Box HARIBO = new Box("haribo");

    private final String present;

    public Box(String present) {
        this.present = present;
    }

    public static Box boxForKids() {
        return new ChristmasBox("snowball");
    }
}
