package edu.kytsmen.designpatterns.observer.v1;


public interface ISubject
{
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
