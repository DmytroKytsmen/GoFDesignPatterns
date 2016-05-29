package edu.kytsmen.designpatterns.facade.v2;

public class RobotFacade {
    RobotColor robotColor;
    RobotMetal robotMetal;
    RobotBody robotBody;

    public RobotFacade() {
        robotBody = new RobotBody();
        robotColor = new RobotColor();
        robotMetal = new RobotMetal();
    }

    public void constructRobot(String color, String metal){
        System.out.println("\nCreation of the Robot Start");
        robotColor.setColor(color);
        robotMetal.setMetal(metal);
        robotBody.createBody();
        System.out.println("\nRobot Creation End");
        System.out.println();
    }
}
