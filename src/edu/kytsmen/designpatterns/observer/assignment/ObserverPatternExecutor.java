package edu.kytsmen.designpatterns.observer.assignment;

public class ObserverPatternExecutor {
    public static void main(String[] args) {
        FirstSubject sub1 = new FirstSubject();
        SecondSubject sub2 = new SecondSubject();

        FirstObserver ob1 = new FirstObserver();
        SecondObserver ob2 = new SecondObserver();
        ThirdObserver ob3 = new ThirdObserver();
        sub1.register(ob1);
        sub1.register(ob2);
        sub2.register(ob2);
        sub2.register(ob3);
        sub1.setMyValue(50);
        System.out.println();
        sub2.setMyValue(250);
        System.out.println();
        sub1.unregister(ob2);
        sub1.setMyValue(550);
        System.out.println();
        sub2.setMyValue(750);
    }
}
