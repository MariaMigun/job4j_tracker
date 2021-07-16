package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
        System.out.println(getClass().getSimpleName() + " Едет по шоссе.");
    }

    @Override
    public void passengers(int number) {
        System.out.println(getClass().getSimpleName() + " вмещает " + number + "пассажиров.");
    }

    @Override
    public int fuel(int volume) {
        return 50 * volume;
    }
}
