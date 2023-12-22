package hexlet.code;

import hexlet.code.Engine;
import java.util.Scanner;
import hexlet.code.games.*;

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
            case 1:
                Cli.runCli();
                break;
            case 2:
                 Even.runEven();
                 break;
            case 3:
                Calc.runCalc();
                break;
            case 4:
                Gcd.runGcd();
                break;
            case 5:
                Progression.runProgression();
                break;
            case 6:
                 Prime.runPrime();
                 break;
            case 0:
                System.out.println("Goodbye!");
                break;
        }
        scanner.close();
    }
}
