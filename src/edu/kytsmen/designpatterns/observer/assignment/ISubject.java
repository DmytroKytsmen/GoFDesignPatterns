package edu.kytsmen.designpatterns.observer.assignment;

public interface ISubject {
    void register(IObserver observer);

    void unregister(IObserver observer);

    void notifyObservers(int value);
}
