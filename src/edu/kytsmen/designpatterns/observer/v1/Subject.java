package edu.kytsmen.designpatterns.observer.v1;

import java.util.ArrayList;
import java.util.List;


public class Subject implements ISubject {
    List<Observer> observerList = new ArrayList<Observer>();
    private int _flag;

    public int getFlag() {
        return _flag;
    }

    public void setFlag(int _flag) {
        this._flag = _flag;
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        if (o != null) {
            observerList.add(o);
        }
    }

    @Override
    public void unregister(Observer o) {
        try {
            observerList.remove(o);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("There is no such observer.");
            exception.printStackTrace();
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer watcher: observerList) {
            watcher.update();
        }
    }
}
