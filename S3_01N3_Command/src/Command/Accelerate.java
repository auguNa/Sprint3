package Invoker;

import Command.Command;
import Receiver.Car;

public class Accelerate implements Command {
    Car car;

    public Accelerate(Car newCar) {
        car = newCar;
    }

    @Override
    public void execute() {
        car.accelerate();
    }
}
