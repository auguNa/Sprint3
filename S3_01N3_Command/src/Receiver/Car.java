package Receiver;

public class Car implements Vehicle {
    private int speed = 0;

    public Car() {
        this.speed = 0;
    }

    @Override
    public void start() {
        System.out.println("The car is ON");

    }

    @Override
    public void accelerate() {
        speed++;
        System.out.println("The car is accelerating at: " + speed);

    }

    @Override
    public void brake() {
        speed--;
        System.out.println("The car is decelerating at: " + speed);

    }
}
