package ru.job4j.tracker;

import java.util.Arrays;


public final class Tracker {

    private static Tracker instance = null;

    private String[] messages = new String[1000];
    private int index = 0;

    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public static Tracker getInstance(){
        if (instance == null){
            instance = new Tracker();
        }
        return instance;
    }

    public void add(String message) {
        messages[index++] = message;
    }


    public void save(){
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll(){
        return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items[index] = item;
        }
        return rsl;
    }
    /*public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if(index != -1){
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }*/

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            System.arraycopy(items, (index + 1), items, index, (size - 1 - index));
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }

    public Item[] findByName(String key){
        Item[] rsl = new Item[items.length];
        int count = 0;
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                rsl[count] = items[index];
                count++;
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}