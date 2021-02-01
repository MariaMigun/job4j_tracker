package ru.job4j.poly;

public class Bus implements Transport{

    @Override
    public void ride() {
    }

    @Override
    public void passengers(int number) {
    }

    @Override
    public int fuel(int volume) {
        int cost = 50*volume;
        return cost;
    }
}
