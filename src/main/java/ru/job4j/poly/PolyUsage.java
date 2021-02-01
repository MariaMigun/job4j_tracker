package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle plOne = new Plane();
        Vehicle shOne = new Ship();
        Vehicle plTwo = new Plane();
        Vehicle trOne = new Train();
        Vehicle trTwo = new Train();

        Vehicle[] vehicles = new Vehicle[]{plOne, plTwo, shOne, trOne, trTwo};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
