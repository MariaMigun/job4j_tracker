package ru.job4j.pojo;

public class ShopDrop {

    public static ru.job4j.oop.Product[] leftShift(ru.job4j.oop.Product[] products, int index) {
        for (int i = index; i < products.length-1; i ++){
            products[i] = products[i + 1];
            }
        products[products.length - 1] = null;
        return products;
    }
}

