package edu.kytsmen.designpatterns.adapter;

public class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;

    public double getArea(Triangle triangle) {
        calculator = new Calculator();
        this.triangle = triangle;
        Rectangle r = new Rectangle();
        r.length = triangle.base;
        r.width = 0.5 * triangle.height;
        return calculator.getArea(r);
    }
}
