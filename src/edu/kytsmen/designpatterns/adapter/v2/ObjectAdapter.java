package edu.kytsmen.designpatterns.adapter.v2;

public class ObjectAdapter {
    private IIntegerValue myInt;

    public ObjectAdapter(IIntegerValue myInt) {
        this.myInt = myInt;
    }

    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}
