import java.util.Random;
import java.util.Scanner;

public class GuessIt {

    public static void main(String[] args) {

        int randomNm = new Random().nextInt(10) + 1;
//       String guessNumText = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
//       int guessNum = Integer.parseInt(guessNumText);
//       if(guessNum == randomNm){
//            System.out.printf("the random num was %d. You got it! %n", randomNm);;
//        } else {
//           System.out.printf("the random num was %d. You didnt get it", randomNm );
//       }


       while(true){
           String guessNumText2 = System.console().readLine("Please guess a number between 1 and 10: \n ");
           int guessNumInt = Integer.parseInt(guessNumText2);
           if(guessNumInt == randomNm){
               System.out.printf("The random number was %d. You got it %n", randomNm);
               return;
           } else {
               System.out.printf("You did not get it \n");
           }
       }


    }

//    int num = 0;
//
//        while (num < 10){
//            System.out.println("Enter number between 0-10");
//            Scanner input = new Scanner(System.in);
//            num = input.nextInt();
//            System.out.println("you number is: " + num);
//        }
}
