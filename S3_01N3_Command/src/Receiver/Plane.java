package Receiver;

public class Plane implements Vehicle{
    private int speed = 0;

    public Plane() {
        this.speed = 0;
    }
    @Override
    public void start() {
        System.out.println("The plane is ON");

    }

    @Override
    public void accelerate() {
        speed++;
        System.out.println("The plane is accelerating at: " + speed);

    }

    @Override
    public void brake() {
        speed--;
        System.out.println("The plane is decelerating at: " + speed);

    }
}
