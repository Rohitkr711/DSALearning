import java.util.ArrayList;

public class findAllIndexOfElement {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 4, 9, 8, 1, 4 };
        System.out.println(findAllIndex(arr, 4, 0));
        // if (idxList.size() > 0) {
        //     System.out.println("Element found at" + idxList);
        // } else {
        //     System.out.println("Element not found");
        // }
    }

    // METHOD-1
    // static ArrayList<Integer> idxList = new ArrayList<>();

    // static void findAllIndex(int[] arr, int target, int idx) {
    //     if (idx == arr.length)
    //         return;

    //     if (arr[idx] == target) {

    //         idxList.add(idx);
    //     }

    //     findAllIndex(arr, target, idx + 1);

    // }

    // METHOD-2
        // static ArrayList<Integer> idxList = new ArrayList<>();

    // static ArrayList findAllIndex(int[] arr, int target, int idx, ArrayList<Integer> idxList) {
    //     if (idx == arr.length)
    //         return idxList;

    //     if (arr[idx] == target) {

    //         idxList.add(idx);
    //     }

    //     return findAllIndex(arr, target, idx + 1, idxList);

    // }

    
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int idx) {
        ArrayList<Integer> idxList = new ArrayList<>();
        if (idx == arr.length)
            return idxList;

        if (arr[idx] == target) {

            idxList.add(idx);
        }

        ArrayList<Integer> returnIdxList = findAllIndex(arr, target, idx + 1);
        idxList.addAll(returnIdxList);
        return idxList;
    }
}
