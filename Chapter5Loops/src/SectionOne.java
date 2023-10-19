import java.util.Random;

public class SectionOne {
    public static void main(String[] args) {
//        int count = 0;
//        while (count < 100){
//            System.out.println("Welcome to java");
//            count++;
//
//            while (count < 15){
//                System.out.println("counting up to 15");
//                count++;
//            }
//        }
////
//        if(doThisfuntion()){
//            System.out.println("did this function");
//        }
//
//        int i = 0;
//        while (i < 10){
//            System.out.println(i);
//            i++;
//        }

//        int j = 0;
//        while (j < 10){
//            int sum =+ j;
//            j++;
//            System.out.println(sum + " <--this is the sum \n this is J--> " + j );
//
//        }

        int number1 = (int) (Math.random() * 10);
        Random newRandom = new Random();
        int number2 = newRandom.nextInt(4);
        System.out.println(number1);


        //while loops, do-while loops, for loops


    }

    public static boolean doThisfuntion(){

        return true;
    }
}
