public class BinarySearch {
    public static void main(String[] args) {
        int [] list ={443, 45, 8, 9, 5};

        binarySearch(list, 4);

    }

    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;

        while(high >= low){
            int mid = (low + high)/2;
            if(key < list[mid]){
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            }
            else {
                low = mid + 1;
            }

        }return -1;
    }
//
//    int k;
//    int [] currentMembers = {56, 5, 84, 9};
//    int memberId;
//
//    for(k = 0; k < currentMembers.length && memberId != currentMembers[k]; k++)

    boolean duplicates = false;

//    for(int j = 0; j < zipCodeList.length; ++j){
//        for(int k = j + 1; k < zipCodeList.length; ++k){
//            if(zipCodeList[j] == ziCodeList[k]){
//                duplicates = true;
//            }
//        }
//    }

}
