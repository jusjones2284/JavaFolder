import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        double [] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};

        Arrays.sort(numbers);
        Arrays.parallelSort(numbers);

        char [] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars, 1, 3);

        for(int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
//
//        Arrays.sort(numbers);

//        System.out.println(numbers[0]);

        int [] list1 = {2, 4, 7, 10};
        int [] list2 = {2, 4, 7, 10};
        int [] list3 = {4, 3, 7, 10};

        System.out.println(Arrays.equals(list1, list2));
        System.out.println(Arrays.equals(list2, list3));


        Arrays.fill(list1, 5);

        System.out.println(list1[1]);


}

}
