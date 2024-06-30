package Receiver;

public class Boat implements Vehicle {
    private int speed = 0;

    public Boat() {
        this.speed = 0;
    }

    @Override
    public void start() {
        System.out.println("Boat is ON");

    }

    @Override
    public void accelerate() {
        speed++;
        System.out.println("Boat is accelerating at: " + speed);

    }

    @Override
    public void brake() {
        speed--;
        System.out.println("Boat is decelerating at: " + speed);

    }
}

