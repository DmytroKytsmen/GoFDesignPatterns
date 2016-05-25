package edu.kytsmen.designpatterns.observer.v2;

public class ObserverPatternExcutor {
    public static void main(String[] args) {
        Subject sub = new Subject();
        FirstObserver firstObserver = new FirstObserver();
        SecondObserver secondObserver = new SecondObserver();

        sub.register(firstObserver);
        sub.register(secondObserver);
        sub.setMyValue(10);
        System.out.println();
        sub.setMyValue(25);
        System.out.println();
        sub.unregister(firstObserver);
        sub.setMyValue(333);
    }
}
