package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int[] row : array) {
            List<Integer> list = new ArrayList<>();
            for (int cell : row) {
                list.add(cell);
            }
            lists.add(list);
        }
        return lists;
    }
}