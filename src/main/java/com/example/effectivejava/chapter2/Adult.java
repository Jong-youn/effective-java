package com.example.effectivejava.chapter2;

public class Adult {
    public static void main(String[] args) throws Exception {
        try (Room myRoom = new Room(7)) {
            System.out.println("방 생성");
        }
    }
}
