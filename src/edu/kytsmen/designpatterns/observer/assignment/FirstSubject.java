package edu.kytsmen.designpatterns.observer.assignment;

import java.util.ArrayList;
import java.util.List;

public class FirstSubject implements ISubject {
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
    public void register(IObserver observer) {
        if (observer != null) {
            observersList.add(observer);
        }
    }

    @Override
    public void unregister(IObserver observer) {
        try {
            observersList.remove(observer);
        } catch (IndexOutOfBoundsException e) {
            System.out.println();
            e.printStackTrace();
        }
    }


    @Override
    public void notifyObservers(int value) {
        for (IObserver watcher : observersList) {
            watcher.update(this.getClass().getSimpleName(), value);
        }
    }
}
