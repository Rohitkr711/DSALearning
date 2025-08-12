class ArraySortUsingRecursion{

    public static void main(String[] args) {
        int[] arr={1,2,11,8,9,12};
        System.out.println(IsArraySort(arr,0));
    }

    static boolean IsArraySort(int[] arr, int idx){
       if(idx==arr.length-1){
        return true;
       }
       return arr[idx]<arr[idx+1] && IsArraySort(arr, idx+1);
    }
}