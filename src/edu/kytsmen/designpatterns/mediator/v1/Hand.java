package edu.kytsmen.designpatterns.mediator.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hand extends BodyPart {
    private boolean isHurt;
    private boolean isSoft;

    public Hand(Brain brain) {
        super(brain);
    }

    public void FeelSomething() {
        System.out.println("What you feel is soft? (Yes/No)");
        String answer;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
            if (answer != null && answer.charAt(0) == 'Y') {
                isSoft = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("What you feel is hurting? (Yes/No)");
        try {
            answer = bufferedReader.readLine();
            if (answer != null && answer.charAt(0) == 'Y') {
                isHurt = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        change();
    }

    public void hitPersonNearYou(){
        System.out.println("HAND: Just hit offender...");
    }

    public void embrace(){
        System.out.println("HAND: Embracint what is in front of you...");
    }
}
