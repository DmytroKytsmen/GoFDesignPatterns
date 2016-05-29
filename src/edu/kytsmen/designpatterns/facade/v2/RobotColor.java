package edu.kytsmen.designpatterns.facade.v2;

public class RobotColor {
    private String color;

    public void setColor(String color) {
        this.color = color;
        System.out.println("Color os set to : " + this.color);
    }
}
