package ru.job4j.pojo;

public class ShopDrop {

    public static ru.job4j.oop.Product[] leftShift(ru.job4j.oop.Product[] products, int index) {
        for (int i = 0; i < products.length; i ++){
            if (i == index){
                int count = products.length - 1 - index;
                for (int j = 1; j <= count; j++){
                    products[i] = products[i + j];
                }
                products[products.length - 1] = null;
            }

        }
        return products;
    }
}

