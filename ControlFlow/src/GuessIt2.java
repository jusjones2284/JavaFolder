import java.io.Console;
import java.util.Random;

public class GuessIt2 {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;

        while (true){
            String guessRandomIntString = System.console().readLine("Please guess enter number between 1 and 10:\n" );
            int guessRandomNum = Integer.parseInt(guessRandomIntString);
            if (guessRandomNum == randomNum){
                System.out.printf("You got it! You matched the random number %d ", randomNum);
                return;
            } else {
                System.out.println("Sorry You didnt guess the random number");
            }
        }



    }
}
