import java.util.Random;

public class Guess3 {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        String guessNumText = null;

        while(!"q".equals(guessNumText)){
            guessNumText = System.console().readLine("Please guess a number between" +
                    "1 and 10 or \"q\" to exit: ");
            if (guessNumText.matches("-?\\d{1,2}")) {
                int guessNumInt = Integer.parseInt(guessNumText);
                if(guessNumInt == randomNum){
                    System.out.printf("The random number was %d. you got it! %n", randomNum);
                    return;
                }else {
                    System.out.printf("You didnt get the num");
                }
            }
        }
    }
}
