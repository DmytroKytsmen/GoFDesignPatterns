package edu.kytsmen.designpatterns.template;

public class TemplateMethodPatternExecutor {
    public static void main(String[] args) {
        BasicEngineering bs = new ComputerScience();
        System.out.println("Computer Science Papers");
        bs.Papers();
        System.out.println();
        bs = new Electronics();
        System.out.println("Electronics Papers");
        bs.Papers();
    }


}
