// package 3_BinarySearch;

import java.util.ArrayList;

public class FirstANDLastIdx {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        firstAndLastIndex(arr, 6);
    }

    static void firstAndLastIndex(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int firstIdx = -1, lastIdx=-1;
        // ArrayList<Integer> indexs = new ArrayList<>();
        if(arr.length==0)
           

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (mid == 0 || arr[mid - 1] != target) {
                    firstIdx = mid;
                    break;
                } else {
                    end = mid - 1;
                }
            }
            else{

                
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        start = 0;
        end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (mid == arr.length - 1 || arr[mid + 1] != target) {
                    lastIdx = mid;
                    break;
                } else {
                    start = mid + 1;
                }
            }
            else{

                
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }


    }
}
