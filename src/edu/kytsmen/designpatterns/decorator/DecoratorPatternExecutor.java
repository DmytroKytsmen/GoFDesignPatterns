package edu.kytsmen.designpatterns.decorator;

public class DecoratorPatternExecutor {
    public static void main(String[] args) {
        System.out.println("***Decorator pattern Demo***");
        ConcreteComponent concreteComponent = new ConcreteComponent();

        ConcreteDecoratorFirstExe firstExe = new ConcreteDecoratorFirstExe();
        firstExe.setComponent(concreteComponent);
        firstExe.doJob();

        ConcreteDecoratorSecondeExe secondeExe = new ConcreteDecoratorSecondeExe();
        secondeExe.setComponent(firstExe);
        secondeExe.doJob();
    }
}
