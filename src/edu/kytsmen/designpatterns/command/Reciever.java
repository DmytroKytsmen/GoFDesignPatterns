package edu.kytsmen.designpatterns.command;

/**
 * Created by Дмитро on 29.05.2016.
 */
public class Reciever {
    public void performUndo() {
        System.out.println("Executing -MyUndoCommand");
    }

    public void performRedo() {
        System.out.println("Executing -MyRedoCommand");
    }
}
