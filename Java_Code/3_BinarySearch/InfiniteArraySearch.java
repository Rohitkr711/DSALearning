// package 3_BinarySearch;

public class InfiniteArraySearch {
    public static void main(String[] args) {
        
        int[] arr = { 2, 3, 4, 5, 7, 9, 11, 33, 34, 36, 48, 56, 98, 101 };
        System.out.println(infiniteArraySearch(arr, 48));
        
    }
    
    static int infiniteArraySearch(int[] arr, int target) {
        int start=0;
        int end=1;

        while(target>arr[end]){
            int temp=end+1;

            end= end+ (temp-start)*2;
            start=temp;
        }
        return SmallestGreater(arr, target, start, end);
        
    }
    
    static int SmallestGreater(int[] nums, int target, int startIndex, int endIndex) {
        int st = startIndex, end = endIndex;
        System.out.println("Start="+st+"end"+end);        

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            
            if (nums[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
        
    }
}