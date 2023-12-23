package hexlet.code;


public final class Engine {
    public static void getGreating() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
    }
    public static void getAnswer(String str) {
        System.out.println(str);
    }
    public static void getCorrect(){
        System.out.println("Correct!");
    }


    public static final int NUMBER_OF_ROUNDS = 3;
    public static final Integer GREAT = 1;
    public static final Integer EVEN = 2;
    public static final Integer CALC = 3;
    public static final Integer GCD = 4;
    public static final Integer PROGRESSION = 5;
    public static final Integer PRIME = 6;
    public static final Integer EXIT = 0;

    public static void getSomething(Game game) {
        game.getData();
        game.getRules();
    }


}


