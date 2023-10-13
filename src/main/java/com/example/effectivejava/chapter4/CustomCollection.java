package com.example.effectivejava.chapter4;

public class CustomCollection extends CustomList {

    @Override
    public boolean add(String s) {
        if (isValidElement(s)) {
            return super.add(s);
        } else {
            throw new IllegalArgumentException("Invalid element");
        }
    }

    private boolean isValidElement(String s) {
        // 보안 조건 체크하는 로직
        if (s.equals("Invalid element")) {
            return false;
        }
        return true;
    }
}
