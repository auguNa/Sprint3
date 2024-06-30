package Invoker;

import Command.Command;

public class VehicleButton {

    Command theCommand;

    public VehicleButton(Command newCommand) {

        this.theCommand = newCommand;
    }
    public void press(){
        theCommand.execute();
    }
}
