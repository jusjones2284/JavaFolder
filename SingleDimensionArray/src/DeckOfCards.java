public class DeckOfCards {
    public static void main(String[] args) {

//        int [] deck = new int[52];
//        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
//        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
//                  "9", "10", "Jack", "Queen", "King"};
//        for(int i = 0; i < deck.length; i++){
//            deck[i] = i;
//        }
//
//        for(int i = 0; i < deck.length; i++){
//            int index =(int) Math.random() * deck.length;
//            int temp = deck[i];
//            deck[i] = deck[index];
//            deck[index] = temp;
//        }
//
//        for(int i = 0; i < 4; i++){
//            String suit = suits[deck[i]/13];
//            String rank = ranks[deck[i] % 13];
//            System.out.println("Card number " + deck[i] + ": "
//                       + rank + " of " + suit);
//        }


        //copying source arrays

//        int[] sourceArray = {2, 3, 1, 5, 10};
//        int[] targetArray = new int[sourceArray.length];
//
//        for(int i = sourceArray.length - 1; i >= 0; i--){
//            for (int j = 0; j < sourceArray.length; j++)
//                targetArray[j] = sourceArray[i];
//                System.out.println(targetArray[i]);
//        }
//        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

//        int[] a = {1,3};
//
//        System.out.println("Before invoking swap");

        int [] boxes = { 5, 6, 10};

        System.out.println(reverse(boxes));


    }


    public static int sumArray(int l[]){
        int i;
        int total = 0;

        for(i = 0; i < l.length; i++){
            total += l[i];
        }
        return total;
    }

    public static int [] reverse(int []a){
        int temp = 0;
        for(int i = 0; i < a.length/2; i++ ){
            temp = a[i];
            a[i] = a[a.length -1 - i];
            a[a.length - 1 - i] = temp;
            System.out.println(a[i]);
        }
        return a;

    }
}
