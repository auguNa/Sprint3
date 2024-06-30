package Invoker;

import Vehicle.Command;

public class Bicycle implements Command {
    private int speed = 0;

    public Bicycle() {
        this.speed = 0;
    }

    @Override
    public void start() {
        System.out.println("The Invoker.Bicycle is ON");

    }

    @Override
    public void accelerate() {
        speed++;
        System.out.println("The Invoker.Bicycle is accelerating at: " + speed);

    }

    @Override
    public void brake() {
        speed--;
        System.out.println("The Invoker.Bicycle is decelerating at: " + speed);

    }
}