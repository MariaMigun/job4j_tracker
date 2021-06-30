package ru.job4j.collection;

import junit.framework.TestCase;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;

public class ItemSorterTest extends TestCase {

    public void testSortUp() {
        List<Item> items1 = Arrays.asList(
                new Item(3, "Bella"),
                new Item(2, "Anna"),
                new Item(1, "Frank")
        );
        List<Item> items2 = Arrays.asList(
                new Item(2, "Anna"),
                new Item(3, "Bella"),
                new Item(1, "Frank")
        );
        Collections.sort(items1, new SortByNameItems());
        assertThat(Collections.sort(items1, new SortByNameItems()), is(items2));
    }
}