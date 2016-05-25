package edu.kytsmen.designpatterns.observer.v2;

public class FirstObserver implements IObserver {
    @Override
    public void update(int i) {
        System.out.println("First observer: myValue in Subject is now: " + i);

    }
}
