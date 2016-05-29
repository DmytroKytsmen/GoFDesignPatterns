package edu.kytsmen.designpatterns.adapter.v2;

public class ClassAdapter extends IntegerValue {
    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}
