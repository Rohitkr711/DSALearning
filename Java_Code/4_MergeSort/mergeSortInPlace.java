import java.util.Arrays;

public class mergeSortInPlace {

    public static void main(String[] args) {

        int[] arr = { 12,8,9,3,11,5,4 };
        mergeSortAlgoInPlace(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortAlgoInPlace(int[] arr, int start, int end) {
        if (start==end) {

            return;
        }

        int mid = start + (end-start)/2;
        mergeSortAlgoInPlace(arr, start, mid);
        mergeSortAlgoInPlace(arr, mid+1, end);

        mergeInPlace(arr, start, mid, end);

    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start+1];

        int i = start;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                ++i;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }

    }
}
