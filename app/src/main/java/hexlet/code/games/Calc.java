package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.RandomNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

import static hexlet.code.Engine.getSomething;

public class Calc implements Game {
    public static void runCalc() {
        Engine.getGreating();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        Calc question1 = new Calc();
        getSomething(question1);

        var correctCount = 0;
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int firstRandomNumber = RandomNumber.getRandomNumber();
            int secondRandomNumber = RandomNumber.getRandomNumber();
            int[] operations = new int[]{firstRandomNumber + secondRandomNumber, firstRandomNumber - secondRandomNumber,
                    firstRandomNumber * secondRandomNumber};

            String[] strOperations = new String[]{" + ", " - ", " * "};
            Random random = new Random();
            int value = random.nextInt(3);
            System.out.println(firstRandomNumber + strOperations[value] + secondRandomNumber);

            int correctAnswer = operations[value];

            int userAnswer = scanner.nextInt();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer == correctAnswer) {
               Engine.getCorrect();
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

    @Override
    public void getRules() {
    }


    @Override
    public void getData() {
        String[] str = new String []{"What is the result of the expression?", "Your answer: "};
        System.out.println(str[0]);
    }
}
