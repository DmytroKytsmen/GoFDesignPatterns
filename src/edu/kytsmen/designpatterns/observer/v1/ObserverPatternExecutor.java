package edu.kytsmen.designpatterns.observer.v1;

public class ObserverPatternExecutor {
    public static void main(String[] args) {
        System.out.println("***Observer Pattern Demo***\n");
        Observer o1 = new Observer();
        Subject sub1 = new Subject();
        sub1.register(o1);
        System.out.println("Setting Flag = 10");
        sub1.setFlag(5);
        System.out.println("Setting Flag = 25");
        sub1.setFlag(25);
        sub1.unregister(o1);
        System.out.println("Setting Flag = 50");
        sub1.setFlag(50);
    }
}
