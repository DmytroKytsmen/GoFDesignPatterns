package edu.kytsmen.designpatterns.observer.assignment;

public class ThirdObserver implements IObserver {
    @Override
    public void update(String subjectName, int value) {
        System.out.println("Third observer is observing: myValue is changed in " + subjectName + " to: " + value);
    }
}
