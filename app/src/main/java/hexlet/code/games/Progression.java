package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void runProgression() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What number is missing in the progression?");
        var correctCount = 0;
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            var startWith = RandomNumber.getRandomNumber();
            var step = RandomNumber.getRandomNumber();
            var index = 0;
            int[] numbers = new int[10];
            while (index < 10) {
                startWith = startWith + step;
                numbers[index] = startWith;
                index++;
            }

            Random random = new Random();
            int value = random.nextInt(10);
            String[] newNumbers = new String[numbers.length];
            for (var j = 0; j < numbers.length; j++) {
                String newNumber = Integer.toString(numbers[j]);
                newNumbers[j] = newNumber;
            }
            newNumbers[value] = "...";
            System.out.println(Arrays.toString(newNumbers));

            var correctAnswer = numbers[value];

            int userAnswer = scanner.nextInt();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer == correctAnswer) {
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




