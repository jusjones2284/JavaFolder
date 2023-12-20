import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {
        System.out.println("Enter ten integers: ");

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            list.add(input.nextInt());
        }

//        list.add(input.nextInt());
//        System.out.println(list.get(0));

    }
    public static void removeDuplicate(){

    }
}


import java.util.Scanner;
public class Exercise11_45{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of points:");
        int numberOfPoints=input.nextInt();

        double[][]points=new double[numberOfPoints][2];
        System.out.println("Enter the coordinates of the points :");
        for(int i=0;i<numberOfPoints;i++){
            for(int j=0; j<2; j++){
                points[i][j]=input.nextDouble();
            }
        }
        input.close();

        double totalArea=computeArea(points);
        System.out.println("The total area is "+totalArea);

    }

    public static double computeArea(double[][]points){
        double totalArea=0;

        for(int i=0; i<points.length;i++){
            int nextIndex = (i + 1) % points.length;


            totalArea += (points[nextIndex][0] + points[i] [0]) * (points[nextIndex][1] - points[i][1]);
        }

        return Math.abs(totalArea)/2.0;
    }
}


package Chapter_11;

        import java.util.ArrayList;
        import java.util.Scanner;

 */
public class Exercise11_17 {

    public static void main(String[] args) {
        System.out.print("Enter an integer m: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();

        getFactors(m, factors);

        int smallestSquare = smallestSquare(factors);
        System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
        System.out.println("m * n = " + (m * smallestSquare));
    }

    private static int smallestSquare(ArrayList<Integer> factors) {

        int[][] occurrences = copy(factors);
        for (int i : factors) {
            search(occurrences, i);
        }

        ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurrences);

        int smallestSquare = 1;
        for (int i : oddSequenceFactors) {
            smallestSquare *= i;
        }
        return smallestSquare;
    }

    private static ArrayList<Integer> removeDuplicates(int[][] m) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < m.length; i++) {
            if (m[i][1] % 2 != 0) {
                temp.add(m[i][0]);
            }
        }

        ArrayList<Integer> duplicateRemoved = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {

            if (!duplicateRemoved.contains(temp.get(i))) {
                duplicateRemoved.add(temp.get(i));
            }
        }

        return duplicateRemoved;
    }

    private static void search(int[][] m, int number) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] == number) {
                m[i][1]++;
            }
        }
    }

    private static int[][] copy(ArrayList<Integer> factors) {

        int[][] temp = new int[factors.size()][2];

        for (int i = 0; i < temp.length; i++) {
            temp[i][0] = factors.get(i);
        }
        return temp;
    }

    private static void getFactors(int m, ArrayList<Integer> factors) {

        int count = 2;
        while (count <= m) {
            if (m % count == 0) {
                factors.add(count);
                m /= count;
            } else {
                count++;
            }
        }
    }

}

