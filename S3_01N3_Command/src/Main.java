import Command.*;
import Invoker.VehicleFunctionControl;
import Receiver.*;

public class Main {
    public static void main(String[] arg) {

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle plane = new Plane();
        Vehicle boat = new Boat();

        Command carStart = new Start(car);
        Command carAccelerate = new Accelerate(car);
        Command carBrake = new Brake(car);

        Command bicycleStart = new Start(bicycle);
        Command bicycleAccelerate = new Accelerate(bicycle);
        Command bicycleBrake = new Brake(bicycle);

        Command planeStart = new Start(plane);
        Command planeAccelerate = new Accelerate(plane);
        Command planeBrake = new Brake(plane);

        Command boatStart = new Start(boat);
        Command boatAccelerate = new Accelerate(boat);
        Command boatBrake = new Brake(boat);

        VehicleFunctionControl controlVehicle = new VehicleFunctionControl();

        controlVehicle.setStartCommand(carStart);
        controlVehicle.setAccelerateCommand(carAccelerate);
        controlVehicle.setBrakeCommand(carBrake);

        System.out.println("Testing Car:");
        controlVehicle.pressStartButton();
        controlVehicle.pressAccelerateButton();
        controlVehicle.pressBrakeButton();

        System.out.println("\nTesting Bicycle:");
        controlVehicle.pressStartButton();
        controlVehicle.pressAccelerateButton();
        controlVehicle.pressBrakeButton();

        controlVehicle.setStartCommand(planeStart);
        controlVehicle.setAccelerateCommand(planeAccelerate);
        controlVehicle.setBrakeCommand(planeBrake);

        System.out.println("\nTesting Plane:");
        controlVehicle.pressStartButton();
        controlVehicle.pressAccelerateButton();
        controlVehicle.pressBrakeButton();

        controlVehicle.setStartCommand(boatStart);
        controlVehicle.setAccelerateCommand(boatAccelerate);
        controlVehicle.setBrakeCommand(boatBrake);

        System.out.println("\nTesting Boat:");
        controlVehicle.pressStartButton();
        controlVehicle.pressAccelerateButton();
        controlVehicle.pressBrakeButton();
    }
}

