package Java_Code.LinearSearch;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 4 },
                { 9, 88, 5, 7 },
                { 0, 8, 3 }
        };
        int[] Indexarr=searchInTwoD(arr, 0);
        for(int i=0;i<Indexarr.length;++i){
            System.out.println(Indexarr[i]);
        }
    }

    static int[] searchInTwoD(int[][] arr, int target) {
    
        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; ++col) {
                 if(arr[row][col]==target)
                 return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
