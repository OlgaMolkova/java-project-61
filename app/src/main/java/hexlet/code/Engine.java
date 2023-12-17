package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

    }
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        return userName;
    }

    public static int userAnswer() {
        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();
        return userAnswer;
    }
}
