package hexlet.code.games;

import hexlet.code.RandomNumber;

import java.util.Scanner;

public class GCD {
    public static void gcd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Find the greatest common divisor of given numbers.");
        var correctCount = 0;
        for (var i = 0; i < 3; i++) {
            int firstRandomNumber = RandomNumber.getRandomNumber();
            int secondRandomNumber = RandomNumber.getRandomNumber();
            System.out.println(Integer.toString(firstRandomNumber) + " " + Integer.toString(secondRandomNumber));
            while (secondRandomNumber != 0) {
                int tmp = firstRandomNumber % secondRandomNumber;
                firstRandomNumber = secondRandomNumber;
                secondRandomNumber = tmp;
            }
            var correctAnswer = firstRandomNumber;

            int userAnswer = scanner.nextInt();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer == firstRandomNumber) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + correctAnswer + "'" + "\nLet's try again," + userName);
                break;
            }
        }
        if (correctCount == 3) {
            System.out.println("Congratulations, " + userName + "!");
            scanner.close();
        }
    }
}
