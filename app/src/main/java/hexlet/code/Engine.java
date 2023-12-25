package hexlet.code;


import hexlet.code.games.Calc;
import java.util.Scanner;

public final class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int GREAT = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;

    public static void run(Game game) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        game.getRules();
        var correctCount = 0;
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + game.getData()[0]);
            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            String correctAnswer = game.getData()[1];
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


