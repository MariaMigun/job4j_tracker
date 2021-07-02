package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemSorterTest {

    @Test
    public void testSortUp() {
        List<Item> input = Arrays.asList(
                new Item(3, "Bella"),
                new Item(2, "Anna"),
                new Item(1, "Frank")
        );
        List<Item> result = Arrays.asList(
                new Item(2, "Anna"),
                new Item(3, "Bella"),
                new Item(1, "Frank")
        );

        Collections.sort(input, new SortByNameItems());
        assertThat(input, is(result));
    }

    @Test
    public void testSortDesc() {
        List<Item> input = Arrays.asList(
                new Item(3, "Bella"),
                new Item(2, "Anna"),
                new Item(1, "Frank")
        );
        List<Item> result = Arrays.asList(
                new Item(1, "Frank"),
                new Item(3, "Bella"),
                new Item(2, "Anna")
        );

        Collections.sort(input, new SortByNameItemsDesc());
        assertThat(input, is(result));
    }

}