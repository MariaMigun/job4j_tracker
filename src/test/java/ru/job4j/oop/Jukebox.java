package ru.job4j.oop;

public class Jukebox {
    public static void musics(int position) {
        String song = "Песня не найдена";
        if (position == 1) {
            song = "Пусть бегут неуклюже";
        } else if (position == 2) {
            song = "Спокойной ночи малыши";
        }
        System.out.println(song);
    }

    public static void main(String[] args) {
       musics(0);
    }
}
