// package DailyCodeProblems.2_TwoSum;

import java.lang.reflect.Array;
import java.util.HashMap;

public class TwoSum {
    static int[] twoSumSol(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;++i){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                 return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);

        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = {2,1,4,3};
        int target = 4;
        int[] ans = twoSumSol(nums, target);
        for (int i : ans) {
            System.out.println(i);
        }
        
    }
}
