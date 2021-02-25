package ru.job4j;

public class Engineer extends Profession {
    private String partner;

    private String factory;

    public Engineer(String text) {
        this.factory = text;
    }

    public String getPartner() {
        return partner;
    }
}
