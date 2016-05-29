package edu.kytsmen.designpatterns.iterator;

public interface IIterator {
    void first();

    String next();

    Boolean isDone();

    String currentItem();
}
