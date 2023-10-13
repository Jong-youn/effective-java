package com.example.effectivejava.chapter4;

import java.util.ArrayList;
import java.util.List;

public class CustomList {

    private List elementData = new ArrayList();

    public boolean add(String s) {
        elementData.add(s);
        return true;
    }

    public boolean addOne(String s) {
        elementData.add(s);
        return true;
    }

    @Override
    public String toString() {
        return "CustomList{" +
                "elementData=" + elementData +
                '}';
    }
}
