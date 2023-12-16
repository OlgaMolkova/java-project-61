package hexlet.code;



public class RandomNumber {
    public static int getRandomNumber() {
        int startWith = 0;
        int stopTo = 100;
        int randomNumber = startWith + (int) (Math.random() * stopTo);

        return randomNumber;
    }
}
