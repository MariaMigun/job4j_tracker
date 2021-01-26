package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Bear bear = new Bear();
        System.out.print("wolf ");
        wolf.tryEat(ball);
        System.out.print("bear ");
        bear.tryEat(ball);
        System.out.print("fox ");
        fox.tryEat(ball);
    }
}
