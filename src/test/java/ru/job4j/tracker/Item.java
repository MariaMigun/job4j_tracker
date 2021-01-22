package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;

    private String name;

    private LocalDateTime created;

    public Item() {
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item(LocalDateTime data) {
        this.created = data;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public static void main(String[] args){
        LocalDateTime currentData = LocalDateTime.now();
        Item item = new Item();
        item.created = currentData;
    }
}
