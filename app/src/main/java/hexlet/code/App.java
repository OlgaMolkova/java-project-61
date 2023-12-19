package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Great\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Your choice " + userChoice);
        if (userChoice == 1) {
            Cli.cli();
        } else if (userChoice == 2) {
            Even.even();
        } else if (userChoice == 3) {
            Calc.calc();
        } else if (userChoice == 4) {
            GCD.gcd();
        } else if (userChoice == 5) {
            Progression.progression();
        } else if (userChoice == 6) {
            Prime.prime();
        }
        scanner.close();
    }
}
