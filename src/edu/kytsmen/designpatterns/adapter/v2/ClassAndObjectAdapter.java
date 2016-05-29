package edu.kytsmen.designpatterns.adapter.v2;

public class ClassAndObjectAdapter {
    public static void main(String[] args) {
        System.out.println("***Class and Object Adapter Demo***");
        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println("Class Adapter is returning: " + classAdapter.getInteger());

        classAdapter = new ClassAdapter();
        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning: " + objectAdapter.getInteger())    ;
    }
}
