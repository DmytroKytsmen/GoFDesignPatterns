package edu.kytsmen.designpatterns.facade.v2;

public class RobotMetal {
    private String metal;

    public void setMetal(String metal) {
        this.metal = metal;
        System.out.println("Metal is set to : " + this.metal);
    }
}
