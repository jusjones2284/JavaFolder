import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    };}
//        int [][] matrix = new int[10][10];

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter " + matrix.length + " rows and "
//        + matrix[0].length + " columns: "
//        );
//
//        for (int row = 0; row < matrix.length; row++){
//            for(int column = 0; column < matrix[row].length; column++){
//                matrix[row][column] = input.nextInt();
//            }
//        }
//
//        for(int row = 0; row < matrix.length; row++){
//            for(int column = 0; column < matrix[row].length; column++){
//                matrix[row][column] = (int)(Math.random() * 100);
//            }
//        }
//
//        int [][] array = {{1,2},
//                        {3,4, 5},
//                        {5, 6},
//                        {4,5,6,9}};
//        int [][] secondArray = new int[3][2];
//
//        System.out.println(array[3].length);
//
//        for(int i = array.length - 1; i >= 0; i-- ){
//            for(int j = array[i].length - 1; j >= 0;  j--){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//
//        }

//        int [][] a2d = {{2,4}, {4,6,5,7}};
//
//      int nElements = 0;
//
//        for(int a = 0; a < a2d.length; a++){
//            nElements += a2d[a].length;
//
//        }
//
//
//        boolean isRectangular = true;
//        for (int j = 1; j < a2d.length && isRectangular; j++)
//            if (a2d[j].length != a2d[0].length)
//                isRectangular = false;
//    }
//    nPositive = 0;
//    for (int a=0; a<a2d.length; a++)
//        for (int j=0; j<a2d[a].length; j++)
//            if (a2d[a][j] > 0)nPositive++;
//
//    sum = 0;
//    for (int i = 0; i<a2d.length; i++)
//        for (int j = 0; j < a2d[i].length; j++)sum += a2d[i][j];