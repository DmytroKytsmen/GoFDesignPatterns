package edu.kytsmen.designpatterns.factorypattern;


public class Duck implements IAnimal {
    @Override
    public void speak() {
        System.out.println("Duck says Pack-pack");
    }
}
