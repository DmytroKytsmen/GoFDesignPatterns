package edu.kytsmen.designpatterns.command;

/**
 * Created by Дмитро on 29.05.2016.
 */
public class CommandPatternExecutor {
    public static void main(String[] args) {
        System.out.println("***Command Pattern Demo***\n");
        Reciever intendedReciever = new Reciever();
        Invoke invoke = new Invoke();
        MyUndoCommand myUndoCommand = new MyUndoCommand(intendedReciever);
        MyRedoCommand myRedoCommand = new MyRedoCommand(intendedReciever);
        invoke.executeCommand(myUndoCommand);
        invoke.executeCommand(myRedoCommand);
    }
}
