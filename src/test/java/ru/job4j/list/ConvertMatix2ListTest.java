package ru.job4j.list;

import org.junit.Test;
import ru.job4j.collection.ConvertMatix2List;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatix2ListTest {
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatix2List list = new ConvertMatix2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}