package edu.kytsmen.designpatterns.observer.v2;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    List<IObserver> observersList = new ArrayList<IObserver>();
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        notifyObservers(myValue);
    }

    @Override
    public void register(IObserver o) {
        if (o != null) {
            observersList.add(o);
        }
    }

    @Override
    public void unregister(IObserver o) {
        try {
            observersList.remove(o);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("There is no such watcher.");
            exception.printStackTrace();
        }
    }

    @Override
    public void notifyObservers(int updatedValue) {
        for (IObserver watcher : observersList) {
            watcher.update(updatedValue);
        }
    }
}
