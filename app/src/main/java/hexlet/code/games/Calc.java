package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.RandomNumber;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

import static hexlet.code.Engine.*;

public class Calc implements Game {
    public static void runCalc() {
        Calc great = new Calc();
        run(great);

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();


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
        System.out.println("What is the result of the expression?");
    }


    @Override
    public String[] getData() {
        int firstRandomNumber = RandomNumber.getRandomNumber();
        int secondRandomNumber = RandomNumber.getRandomNumber();
        int[] operations = new int[]{firstRandomNumber + secondRandomNumber, firstRandomNumber - secondRandomNumber,
                firstRandomNumber * secondRandomNumber};

        String[] strOperations = new String[]{" + ", " - ", " * "};
        Random random = new Random();
        int value = random.nextInt(3);
        System.out.println(firstRandomNumber + strOperations[value] + secondRandomNumber);

        int correctAnswer = operations[value];
        String[] arr = new String[2];
        arr[0] = firstRandomNumber + strOperations[value] + secondRandomNumber;
        arr[1] = String.valueOf(operations[value]);
        return arr;
    }
}
