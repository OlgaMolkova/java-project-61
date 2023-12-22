package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.Scanner;

public class Prime {
    public static String isSimple(int number) {
        int remainder;
        boolean isPrime = true;
        var isPrimeNumber = " ";
        for (int i = 2; i <= number / 2; i++) {
            remainder = number % i;
            if (remainder == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            isPrimeNumber = "yes";
        } else {
            isPrimeNumber = "no";
        }
        return isPrimeNumber;
    }
    public static void runPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var correctCount = 0;

        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            var randomNumber = RandomNumber.getRandomNumber();
            System.out.println(randomNumber);
            var correctAnswer = isSimple(randomNumber);

            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + correctAnswer + "'" + "\nLet's try again," + userName);
                break;
            }
            if (correctCount == 3) {
                System.out.println("Congratulations, " + userName + "!");
                scanner.close();

            }
        }
    }
}
