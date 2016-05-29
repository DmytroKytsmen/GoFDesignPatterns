package edu.kytsmen.designpatterns.facade.v2;

public class FacadePatternExecutor {
    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo***");
        RobotFacade robotFacade1 = new RobotFacade();
        robotFacade1.constructRobot("Green", "Iron");
        RobotFacade robotFacade2 = new RobotFacade();
        robotFacade2.constructRobot("Blue", "Steel");
    }
}
