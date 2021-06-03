package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        /* for-each origin -> new HashSet. */
        for (String orig : origin){
            check.add(orig);
        }
        /* for-each text -> hashSet.contains */
        for (String dupl : text){
            if (!check.contains(dupl)){
                rsl = false;
            }
        }
        return rsl;
    }
}
