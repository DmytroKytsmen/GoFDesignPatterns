package edu.kytsmen.designpatterns.command;

/**
 * Created by Дмитро on 29.05.2016.
 */
public class MyRedoCommand implements ICommand {
    private Reciever reciever;

    public MyRedoCommand(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void Do() {
        reciever.performRedo();
    }
}
