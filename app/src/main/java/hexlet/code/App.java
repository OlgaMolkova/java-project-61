package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Great\n2 - Even\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Your choice " + userChoice);
        if (userChoice == 1) {
            Cli.cli();
        } else if (userChoice == 2) {
            Even.even();
        } else {
            scanner.close();
        }
    }
}
