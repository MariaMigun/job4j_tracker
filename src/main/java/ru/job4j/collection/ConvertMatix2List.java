package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertMatix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}