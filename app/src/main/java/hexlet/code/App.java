package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Great\n2 - Even\n3 - Calc\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Your choice " + userChoice);
        if (userChoice == 1) {
            Cli.cli();
        } else if (userChoice == 2) {
            Even.even();
        } else if (userChoice == 3) {
            Calc.calc();
        }
        scanner.close();
    }
}
