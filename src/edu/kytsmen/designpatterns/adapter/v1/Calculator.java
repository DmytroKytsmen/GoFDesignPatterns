package edu.kytsmen.designpatterns.adapter.v1;

public class Calculator {
    Rectangle rectangle;

    public double getArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
}
