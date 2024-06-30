package Invoker;

import Command.Command;
import Receiver.Car;

public class Brake implements Command {
    Car car;

    public Brake(Car newCar) {
        car = newCar;
    }

    @Override
    public void execute() {
        car.brake();
    }
}

