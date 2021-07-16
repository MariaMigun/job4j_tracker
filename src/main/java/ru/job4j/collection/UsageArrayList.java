package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList<String>();
        obj.add("Maria");
        obj.add("Marina");
        obj.add("Marianna");
        for (Object value : obj) {
            System.out.println(value);
        }
    }
}
