public class SelectionSort {

    public static void selectionSort(double[] list){
        for(int i = 0; i < list.length; i++){
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++ ){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
//            if(currentMinIndex != i){
//                list[currentMin] = list[j];
//
//            }
        }



    }

    public static void main(String[] args) {

        double [] list = {-2, 4.5, 5, 1, 2, -3.3};

        SelectionSort.selectionSort(list);
    }


}
