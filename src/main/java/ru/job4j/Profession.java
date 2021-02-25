package ru.job4j;

public class Profession {
    private String name;

    private String surname;

    private String education;

    private String birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEducation() {
        return education;
    }

    public Profession(String text) {
        this.name = text;
    }

    public static void main(String[] args) {
        String firstName = "Ivan";
        Profession item = new Profession(firstName);
    }

}