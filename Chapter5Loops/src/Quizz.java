//import java.util.Scanner;
//
//public class Quizz {
//
//import java.util.Scanner;
//
//    public class Exercise05_09 {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//
//            System.out.print("Enter the number of students: ");
//            int numberOfStudents = input.nextInt();
//            System.out.print("Enter a student name: ");
//            String student1 = input.next();
//            System.out.print("Enter a student score: ");
//            double score1 = input.nextDouble();
//            System.out.print("Enter a student name: ");
//            String student2 = input.next();
//            System.out.print("Enter a student score: ");
//            double score2 = input.nextDouble();
//
//            if (score1 < score2) {
//
//                String tempString = student1;
//                double tempScore = score1;
//                student1 = student2;
//                score1 = score2;
//                student2 = tempString;
//                score2 = tempScore;
//            }
//            for (int i = 0; i < numberOfStudents - 2; i++) {
//                System.out.print("Enter a student name: ");
//                String student = input.next();
//                System.out.print("Enter a student score: ");
//                double score = input.nextDouble();
//                if (score > score1) {
//                    student2 = student1;
//                    score2 = score1;
//                    student1 = student;
//                    score1 = score;
//                }
//                else if (score > score2) {
//                    student2 = student;
//                    score2 = score;
//                }
//            }
//            System.out.println("Top two students:");
//            System.out.println(student1 + "'s score is " + score1);
//            System.out.println(student2 + "'s score is " + score2);
//        }
//    }
//
//
//
//    public class Exercise_21 {
//
//        public static void main(String[] args) {
//
//            double annualInterestRate = 5.00;
//
//
//            Scanner input = new Scanner(System.in);
//
//
//            System.out.printf("Loan amount: ");
//            double loanAmount = input.nextDouble();
//
//
//            System.out.print("Number of Years: ");
//            int numberOfYears = input.nextInt();
//
//
//
//            System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment","Total Payment");
//
//            for ( ; annualInterestRate <= 8.00; annualInterestRate += 0.125) {
//
//
//                double monthlyInterestRate = annualInterestRate / 1200;
//                double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
//
//                double totalPayment = monthlyPayment * numberOfYears * 12;
//
//                String str = "%";
//
//                System.out.printf("%-1.3f%s%17.2f%24.2f \n",annualInterestRate , str, ((int)(monthlyPayment * 100) / 100.0), ((int)(totalPayment * 100) / 100.0));
//
//            }
//
//        }
//    }
//
//

import java.util.Scanner;

public class Exercise_05_47 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
//        String isbn = input.nextLine();
//
//
//        if (isbn.length() != 12) {
//            System.out.println(isbn + " is an invalid input");
//            System.exit(1);
//        }
//
//        int checksum = 0;
//=
//        for (int i = 0; i < isbn.length(); i++) {
//            checksum += i % 2 == 0 ? 3 * Integer.parseInt(isbn.charAt(i) + "")
//                    : Integer.parseInt(isbn.charAt(i) + "");
//        }
//        checksum = 10 - checksum % 10;
//        System.out.println("The ISBN-13 number is " + isbn +
//                (checksum == 10 ? 0 : checksum));

        int [] deck = new int[52];

        for (int i = 0; i < deck.length; i++){
            deck[i] = i;
        }
    }
}