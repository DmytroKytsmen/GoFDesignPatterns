package edu.kytsmen.designpatterns.adapter;

public class Calculator {
    Rectangle rectangle;

    public double getArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
}
