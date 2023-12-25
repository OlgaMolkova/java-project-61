package hexlet.code;

import hexlet.code.Engine;
import java.util.Scanner;
import hexlet.code.games.*;

import static hexlet.code.Engine.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("""
        1 - Great
        2 - Even
        3 - Calc
        4 - GCD
        5 - Progression
        6 - Prime
        0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Your choice " + userChoice);

        switch (userChoice) {
            case GREAT:
                Cli.runCli();
                break;
            case EVEN:
                 Engine.run(new Even());
                 break;
            case CALC:
                Engine.run(new Calc());
                break;
            case GCD:
                Gcd.runGcd();
                break;
            case PROGRESSION:
                Progression.runProgression();
                break;
            case PRIME:
                 Prime.runPrime();
                 break;
            case EXIT:
                System.out.println("Goodbye!");
                break;
        }
        scanner.close();
    }
}
