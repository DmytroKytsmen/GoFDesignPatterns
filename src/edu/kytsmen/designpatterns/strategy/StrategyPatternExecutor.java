package edu.kytsmen.designpatterns.strategy;

import java.io.IOException;
import java.util.Scanner;

public class StrategyPatternExecutor {
    public static void main(String[] args) throws IOException {
        System.out.println("***Strategy Pattern Demo");
        Scanner in = new Scanner(System.in);
        IChoice ic = null;
        Context context = new Context();
        String input1, input2;
        try {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter an integer: ");
                input1 = in.nextLine();
                System.out.println("Enter another integer: ");
                input2 = in.nextLine();
                System.out.println("Enter your choice(1 or 2):");
                System.out.println("Press 1 for Addition, 2 for Concatenation:");
                String choice = in.nextLine();
                if (choice.equals("1")) {
                    ic = new FirstChoice();
                } else {
                    ic = new SecondChoice();
                }
                context.setMyContext(ic);
                context.showChoice(input1, input2);
            }
        } finally {
            in.close();
        }
        System.out.println("End of Strategy pattern.");
    }
}
