package edu.kytsmen.designpatterns.observer.assignment;

public class FirstObserver implements IObserver {
    @Override
    public void update(String subjectName, int value) {
        System.out.println("First Observer: myValue in " + subjectName + " is now: " + value);
    }
}
