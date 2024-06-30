package Invoker;

import Command.Command;
import Receiver.Car;

public class Start implements Command {

    Car car;

    public Start(Car newCar) {
        car = newCar;
    }

    @Override
    public void execute() {
        car.start();
    }
}
