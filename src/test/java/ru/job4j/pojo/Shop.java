package ru.job4j.pojo;

import ru.job4j.oop.Product;

public class Shop {
    public static int indexOfNull(ru.job4j.oop.Product[] products) {
        int num = -1;
        for (int i = 0; i < products.length; i++) {
            Product prod = products[i];
            if (prod == null) {
                num = i;
                break;
            }
        }
        return num;
    }
}
