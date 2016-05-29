package edu.kytsmen.designpatterns.adapter.v2;

public class IntegerValue implements IIntegerValue {
    @Override
    public int getInteger() {
        return 5;
    }
}
