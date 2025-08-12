class linearSearch {
    public static void main(String[] args) {
        int arr[]={3,2,1,18,9};
        System.out.println(findElement(arr,0,0));
    }

    static int findElement(int[] arr, int target, int idx) {
        if (idx == arr.length)
            return -1;
        if (arr[idx] == target)
            return idx;

        return findElement(arr, target, idx + 1);

    }
}