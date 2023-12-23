package hexlet.code;


import java.util.Random;
import java.util.Scanner;

public final class Engine {
    public static void getGreating() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
    }

    public static void getAnswer(String str) {
        System.out.println(str);
    }

    public static void getCorrect() {
        System.out.println("Correct!");
    }


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

        System.out.println(game.getRules());
        var correctCount = 0;
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int firstRandomNumber = RandomNumber.getRandomNumber();
            int secondRandomNumber = RandomNumber.getRandomNumber();
            int[] operations = new int[]{firstRandomNumber + secondRandomNumber, firstRandomNumber - secondRandomNumber,
                    firstRandomNumber * secondRandomNumber};

            String[] strOperations = new String[]{" + ", " - ", " * "};
            Random random = new Random();
            int value = random.nextInt(3);


            int correctAnswer = operations[value];

            int userAnswer = scanner.nextInt();


            if (userAnswer == correctAnswer) {
                Engine.getCorrect();
                correctCount++;
            } else {

                break;
            }
        }

    }
}


