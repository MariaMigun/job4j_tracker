package ru.job4j.pojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ShopTest {
    @Test
    public void whenLastNull() {
        ru.job4j.oop.Product products[] = new ru.job4j.oop.Product[5];
        products[0] = new ru.job4j.oop.Product("Milk", 10);
        products[1] = new ru.job4j.oop.Product("Bread", 4);
        products[2] = new ru.job4j.oop.Product("Egg", 19);
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl, is(3));
    }

    @Test
    public void whenFirstNull() {
        ru.job4j.oop.Product products[] = new ru.job4j.oop.Product[5];
        products[1] = new ru.job4j.oop.Product("Milk", 10);
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl, is(0));
    }

    @Test
    public void whenHasNotNull() {
        ru.job4j.oop.Product products[] = new ru.job4j.oop.Product[1];
        products[0] = new ru.job4j.oop.Product("Milk", 10);
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl, is(-1));
    }
}