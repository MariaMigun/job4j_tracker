package ru.job4j.oop;

public class Cat {

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    private String food;

    private String name;

    public void show() {
        System.out.println(this.name + " eats " + this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
        Cat gav = new Cat();
        gav.giveNick("gav");
        gav.eat("Kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();

    }
}
