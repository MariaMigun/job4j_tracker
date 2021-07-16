package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl < 0) {
            throw new ElementNotFoundException("There is no element");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] str = {"as", "asx", "ff", "ree"};
        try {
            indexOf(str, "ree");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
