package edu.kytsmen.designpatterns.factorypattern;

/**
 * Created by Дмитро on 30.05.2016.
 */
public class FactoryPatternExecutor {
    public static void main(String[] args) throws Exception {
        System.out.println("***Factory Pattern Demo***\n");
        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal duckType = animalFactory.getAnimalType("Duck");
        duckType.speak();

        IAnimal tigerType = animalFactory.getAnimalType("Tiger");
        tigerType.speak();
        IAnimal lionType = animalFactory.getAnimalType("Lion");
        lionType.speak();
    }
}
