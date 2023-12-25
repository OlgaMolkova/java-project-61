package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.RandomNumber;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

import static hexlet.code.Engine.*;

public class Calc implements Game {

    public void getRules() {
        System.out.println("What is the result of the expression?");
    }

    public String[] getData() {
        int firstRandomNumber = RandomNumber.getRandomNumber();
        int secondRandomNumber = RandomNumber.getRandomNumber();
        int[] operations = new int[]{firstRandomNumber + secondRandomNumber, firstRandomNumber - secondRandomNumber,
                firstRandomNumber * secondRandomNumber};

        String[] strOperations = new String[]{" + ", " - ", " * "};
        Random random = new Random();
        int value = random.nextInt(3);

        int correctAnswer = operations[value];
        String[] arr = new String[2];
        arr[0] = firstRandomNumber + strOperations[value] + secondRandomNumber;
        arr[1] = String.valueOf(operations[value]);
        return arr;
    }
}
