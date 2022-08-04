package com.aditya;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(67);
        list.add(673);
        list.add(6);
        list.add(7);
        list.add(637);
        list.add(6722);
        System.out.println(list.contains(6722));
        System.out.println(list);
//        System.out.println(list.get);
    }
}
