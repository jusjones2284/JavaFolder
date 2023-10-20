import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
//
//        int [][] triangleArray = new int[5][];
//        triangleArray[0] = new int[5];
//        triangleArray[1] = new int[4];
//        triangleArray[2] = new int[3];
//
//        System.out.println(triangleArray[0].length);

        int [][] matrix = new int[10][10];
//
//        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns");
//        Scanner input = new Scanner(System.in);
//        for(int row = 0; row < matrix.length; row++){
//            for(int column = 0; column < matrix[row].length; column++){
//                matrix[row][column] = input.nextInt();
//
//            }
//        }

        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int)(Math.random() * 100);
//                System.out.println();
            }
        }

        for(int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                System.out.println(matrix[row][column] + " ");
            }

            int total = 0;
            for(int rows = 0; row < matrix.length; row++){
                for (int column = 0; column < matrix[row].length; column++){
                    total += matrix[row][column];
                }
            }
        }

        int [][] array = {{1,2}, {3,4}, {5,6}};
        for(int i = array.length - 1; i >= 0; i--){
            for(int j = array[i].length - 1; j >= 0; j--){
                System.out.println(array[i][j]);
            }
        }

        int sums = 0;
        for (int i = 0; i < array.length; i++){
            sums += array[i][0];
            System.out.println(sums);
        }







    }
}
