package Invoker;

import Vehicle.Command;

public class Car implements Command {
    private int speed = 0;

    public Car() {
        this.speed = 0;
    }

    @Override
    public void start() {
        System.out.println("The Invoker.Car is ON");

    }

    @Override
    public void accelerate() {
        speed++;
        System.out.println("The car is accelerating at: " + speed);

    }

    @Override
    public void brake() {
        speed--;
        System.out.println("Invoker.Car is decelerating at: " + speed);

    }
}
