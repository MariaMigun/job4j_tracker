package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;


public final class Tracker {

    private static Tracker instance = null;

    private final  List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public static Tracker getInstance(){
        if (instance == null){
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        /*items[size++] = item;*/
        return item;
    }

    public Item findById(int id) {

        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public List<Item> findAll(){
        return new ArrayList<Item>(items);
    }


    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.set(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }

    public List<Item> findByName(String key){
        List<Item> copyNames = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                copyNames.add(item);
            }
        }
        return copyNames;
}