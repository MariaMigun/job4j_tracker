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
        return 50*volume;
    }
}
