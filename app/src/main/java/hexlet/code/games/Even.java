package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.Scanner;

public class Even {
    public static void runEven() {
        Engine.getGreating();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        var question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.getAnswer(question);

        var correctCount = 0;
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            var randomNumberCurrent = RandomNumber.getRandomNumber();
            System.out.println("Question: " + randomNumberCurrent);
            String userAnswer = scanner.next();
            System.out.println("Your Answer: " + userAnswer);

            if (randomNumberCurrent % 2 == 0 && userAnswer.equals("yes")
                    || randomNumberCurrent % 2 != 0 && userAnswer.equals("no")) {
                Engine.getCorrect();
                correctCount++;
            } else if (randomNumberCurrent % 2 == 0 && !userAnswer.equals("yes")) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'yes'.\n"
                        + "Let's try again " + userName + " !");
                break;
            } else if (randomNumberCurrent % 2 != 0 && !userAnswer.equals("no")) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again " + userName + " !");
                break;
            }

        }
        if (correctCount == 3) {
            System.out.println("Congratulations, " + userName + "!");
            scanner.close();
        }
    }
}
