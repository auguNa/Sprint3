package Receiver;

public class Bicycle implements Vehicle {
    private int speed = 0;

    public Bicycle() {
        this.speed = 0;
    }

    @Override
    public void start() {
        System.out.println("Bicycle is ON");

    }

    @Override
    public void accelerate() {
        speed++;
        System.out.println("Bicycle is accelerating at: " + speed);

    }

    @Override
    public void brake() {
        speed--;
        System.out.println("Bicycle is decelerating at: " + speed);

    }
}