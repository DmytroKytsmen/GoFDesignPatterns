package edu.kytsmen.designpatterns.command;

/**
 * Created by Дмитро on 29.05.2016.
 */
public class Invoke {
    ICommand command;

    public void executeCommand(ICommand command) {
        this.command = command;
        command.Do();
    }
}
