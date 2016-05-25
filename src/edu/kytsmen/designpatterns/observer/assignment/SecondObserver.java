package edu.kytsmen.designpatterns.observer.assignment;

public class SecondObserver implements IObserver {
    @Override
    public void update(String subjectName, int value) {
        System.out.println("Second observer: observers -> myValue is changed in " + subjectName + " to:" +
                "" + value);
    }
}
