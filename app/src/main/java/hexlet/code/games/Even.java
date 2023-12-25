package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.RandomNumber;

import java.util.Scanner;

public class Even implements Game {





    public void getRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public String[] getData() {
        //for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int randomNumberCurrent = RandomNumber.getRandomNumber();

           /* if (randomNumberCurrent % 2 == 0 && userAnswer.equals("yes")
                    || randomNumberCurrent % 2 != 0 && userAnswer.equals("no")) {
                //   Engine.getCorrect();
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
            if (correctCount == 3) {
                System.out.println("Congratulations, " + userName + "!");
                scanner.close();
            }*/
            String a = randomNumberCurrent % 2 == 0 ? "yes" : "no";
            String[] arr = new String[2];
            arr[0] = String.valueOf(randomNumberCurrent);
            arr[1] = a;
            return arr;

        }


}
