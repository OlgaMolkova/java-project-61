package hexlet.code.games;
import hexlet.code.RandomNumber;
import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

public class Calc {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What is the result of the expression?");
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
