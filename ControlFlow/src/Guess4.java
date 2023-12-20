import java.util.Random;

public class Guess4 {

    public static final int MAX_ALLOWED_TRIED = 0;

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        System.out.printf("Random number is %d. %n", randomNum);
        String guessedNumText = null;
        int wrongGuessCount = 4;
        do {
            guessedNumText = System.console().readLine("Please " +
                    "guess a number between 1 and 10 inclusively: ");
            if(guessedNumText.matches("-?\\d{1,2}")){
               int guessedNum = Integer.parseInt(guessedNumText);
               if(guessedNum == randomNum){
                   String tryText = wrongGuessCount == 1? "try": "tries";
                   System.out.printf("The random number was %d. You got it in %d" +
                           "%s! %n", wrongGuessCount, tryText);
                   return;
               }else {
                   System.out.printf("You didnt get it! %n");
//                   if(wrongGuessCount >= 4){
//                       System.out.printf("You've had %d incorrect guesses. The random ", wrongGuessCount);
//                       return;
//                   }
                   wrongGuessCount --;
                   System.out.printf("You have %d tries left", wrongGuessCount);
               }
            }
        } while (!"q".equals(guessedNumText) && wrongGuessCount > MAX_ALLOWED_TRIED);
    }
}

