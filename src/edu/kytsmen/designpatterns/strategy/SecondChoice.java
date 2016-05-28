package edu.kytsmen.designpatterns.strategy;

public class SecondChoice implements IChoice {
    @Override
    public void myChoice(String s1, String s2) {
        System.out.println("You wanted to concatenate the numbers.");
        System.out.println("THe result of the addition is:" + s1 + s2);
        System.out.println("***End of the strategy***");
    }
}
