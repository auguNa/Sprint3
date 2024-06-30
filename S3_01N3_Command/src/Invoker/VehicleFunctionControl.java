package Invoker;

import Command.Command;

public class VehicleFunctionControl {

    private Command startCommand;
    private Command accelerateCommand;
    private Command brakeCommand;

    public void setStartCommand(Command startCommand) {
        this.startCommand = startCommand;
    }

    public void setAccelerateCommand(Command accelerateCommand) {
        this.accelerateCommand = accelerateCommand;
    }

    public void setBrakeCommand(Command brakeCommand) {
        this.brakeCommand = brakeCommand;
    }

    public void pressStartButton() {
        startCommand.execute();
    }

    public void pressAccelerateButton() {
        accelerateCommand.execute();
    }

    public void pressBrakeButton() {
        brakeCommand.execute();
    }
}