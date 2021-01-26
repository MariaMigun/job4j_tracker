package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = "Неизвестное слово " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic dictionary = new DummyDic();
        String newword = dictionary.engToRus("house");
        System.out.println(newword);
    }

}
