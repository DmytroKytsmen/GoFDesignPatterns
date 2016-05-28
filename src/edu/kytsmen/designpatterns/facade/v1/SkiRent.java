package edu.kytsmen.designpatterns.facade.v1;
//complex logic is ommited
public class SkiRent {
    private static int BOOTSVALUE = 20;
    private static int SKIVALUE = 40;
    private static int POLEVALUE = 5;


    public int rentBoots(int feetSize, int skierLevel) {
        return BOOTSVALUE;
    }

    public int rentSki(int weight, int skierLevel) {
        return SKIVALUE;
    }

    public int rentPole(int height) {
        return POLEVALUE;
    }
}
