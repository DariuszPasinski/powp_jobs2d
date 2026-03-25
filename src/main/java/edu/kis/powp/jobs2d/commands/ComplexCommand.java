package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List <DriverCommand> listOfCommands;

    public void add(DriverCommand command) {
        listOfCommands.add(command);
    }

    public void execute(Job2dDriver driver){
        for(DriverCommand command: listOfCommands) {
            command.execute(driver);
        }
    }
}
