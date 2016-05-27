package edu.kytsmen.designpatterns.decorator;


public class ConcreteDecoratorSecondeExe extends AbstractDecorator{
    @Override
    public void doJob() {
        System.out.println("");
        System.out.println("***START Ex-2***");
        super.doJob();
        System.out.println("Explicitly from Decorator Ex2");
        System.out.println("***END. Ex-2***");
    }
}
