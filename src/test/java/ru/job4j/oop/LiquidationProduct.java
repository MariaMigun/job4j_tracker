package ru.job4j.oop;

public class LiquidationProduct extends Product {
    private Product product;

    public LiquidationProduct(String  name, int price) {
        super(name, price);
        product = new Product(name, price);
    }

    public String label() {
        return product.label();
    }

    @Override
    public int discount() {
        return 90;
    }

  /* @Override
    public String label() {
        return name + " " + price();
    }*/
}
