//import java.util.Scanner;
//
//public class GuessNumber {
//    public static void main(String[] args) {
//
//        int number = (int) Math.random() * 101;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Guess a number between 0 and 100");
//
//        int guess = -1;
//
//        while (guess != number){
//            System.out.println("\nenter your guess: ");
//            guess = input.nextInt();
//
//            if(guess == number){
//                System.out.println("Yes, the number is " + number);
//            } else if (guess > number){
//                System.out.println("Your guess is too high");
//            } else System.out.println("Your guess is too low");
//
//        }
//
//        int od = 0;
//        int even = 0;
//        int i=1;
//        while (i>0){
//            i = stdin.nextInt();
//            if ((i % 2)==0 && (i>0)){
//                even+=i;
//            }
//
//            if ((i % 2)!=0 && (i>0)){
//                odd+=i;
//            }
//        }
//        System.out.print(even);
//
//        int n, prev, conSec = 0;
//        prev = stdin.nextInt();
//        n = stdin.nextInt();
//        while (n >= 0) {
//            if (n == prev)
//                conSec++;
//            prev = n;
//            n = stdin.nextInt();
//        }
//        System.out.println(conSec);




