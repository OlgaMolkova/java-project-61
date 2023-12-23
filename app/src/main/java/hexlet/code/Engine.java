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
    public static final int GREAT = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;

    public static void run(Game game) {
        game.getData();
        game.getRules();
        getGreating();

    }


}


