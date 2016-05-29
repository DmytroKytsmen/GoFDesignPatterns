package edu.kytsmen.designpatterns.factorypattern;

public abstract class IAnimalFactory {
    public abstract IAnimal getAnimalType(String type) throws Exception;

}
