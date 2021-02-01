package ru.job4j.poly;

public class Ship implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ходит по морю.");
    }
}
