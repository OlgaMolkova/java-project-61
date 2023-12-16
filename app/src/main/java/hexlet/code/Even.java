package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void even() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            var randomNumberCurrent = RandomNumber.getRandomNumber();
            System.out.println("Question: " + randomNumberCurrent);
            String userAnswer = scanner.next();
            System.out.println("Your Answer: " + userAnswer);

            if (randomNumberCurrent % 2 == 0 && userAnswer.equals("yes") || randomNumberCurrent % 2 != 0 && userAnswer.equals("no")) {
                System.out.println("Correct!");
            } else if (randomNumberCurrent % 2 == 0 && !userAnswer.equals("yes")) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again " + userName + " !");
            } else if (randomNumberCurrent % 2 != 0 && !userAnswer.equals("no")) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again " + userName + " !");
            }

        }
        scanner.close();
    }
}