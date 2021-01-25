package ru.job4j.pojo;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ShopDropTest {

    @Test
    public void whenDropFirst() {
        ru.job4j.oop.Product[] products = new ru.job4j.oop.Product[2];
        products[0] = new ru.job4j.oop.Product("Milk", 10);
        products[1] = new ru.job4j.oop.Product("Bread", 4);
        ru.job4j.oop.Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
        ru.job4j.oop.Product[] products = new ru.job4j.oop.Product[2];
        products[0] = new ru.job4j.oop.Product("Milk", 10);
        products[1] = new ru.job4j.oop.Product("Bread", 4);
        ru.job4j.oop.Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], is(nullValue()));
    }
}