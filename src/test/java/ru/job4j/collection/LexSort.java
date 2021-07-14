package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        String[] leftStr = left.split("\\.");
        String[] rightStr = right.split("\\.");
        for (int i = 0; i < Math.min(leftStr.length, rightStr.length); i++) {
            int leftNum = Integer.parseInt(leftStr[i]);
            int rightNum = Integer.parseInt(rightStr[i]);
            rsl = Integer.compare(leftNum, rightNum);
            if (rsl != 0){
                return rsl;
            }
        }
        return rsl;
    }
}
