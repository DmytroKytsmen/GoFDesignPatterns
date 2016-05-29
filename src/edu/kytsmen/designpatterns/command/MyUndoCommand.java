package edu.kytsmen.designpatterns.command;

/**
 * Created by Дмитро on 29.05.2016.
 */
public class MyUndoCommand implements ICommand {
    private Reciever reciever;

    public MyUndoCommand(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void Do() {
        reciever.performUndo();
    }
}
