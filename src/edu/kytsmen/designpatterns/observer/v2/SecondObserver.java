package edu.kytsmen.designpatterns.observer.v2;

public class SecondObserver implements IObserver {
    @Override
    public void update(int i) {
        System.out.println("Second observer: observes -> my Value is changed in Subject to: " + i);
    }
}
