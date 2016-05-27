package edu.kytsmen.designpatterns.decorator;

public class ConcreteDecoratorFirstExe extends  AbstractDecorator{
    @Override
    public void doJob() {
        super.doJob();
        System.out.println("I am explicitly from First Ex");
    }
}
