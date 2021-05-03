package ru.job4j.list;

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

    public void main(String[] args) {
        int[][] array = new int[2][2];
        List<Integer> list = toList(array);
        for (Integer num : list) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}