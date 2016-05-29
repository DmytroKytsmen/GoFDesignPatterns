//package edu.kytsmen.designpatterns.mediator.v1;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Ear extends BodyPart {
//    private String sounds;
//
//    public Ear(Brain brain) {
//        super(brain);
//        sounds = "";
//    }
//
//    public String getSounds() {
//        return sounds;
//    }
//
//    public void hearSomething() {
//        System.out.println("Enter what you hear:");
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            sounds = bufferedReader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            change();
//        }
//
//
//    }
//}
