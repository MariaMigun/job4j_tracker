package ru.job4j.collection;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(5, "day"),
                new Item(2, "bread"),
                new Item(1, "TEA")
        );
        System.out.println(items);
        /*Collections.sort(items, new SortByNameItems());
        System.out.println(items);
        Collections.sort(items, new SortByNameItems().reversed());
        System.out.println(items);*/
    }
}
