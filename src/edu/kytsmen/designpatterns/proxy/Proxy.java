package edu.kytsmen.designpatterns.proxy;

public class Proxy extends Subject {
    ConcreteSubject concreteSubject;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now");
        if (concreteSubject == null) {
            concreteSubject = new ConcreteSubject();
        }
        concreteSubject.doSomeWork();
    }
}
