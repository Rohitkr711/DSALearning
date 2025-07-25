class ceilingNumberBS {
    public static void main(String[] args) {
        int nums[] = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(SmallestGreater(nums, 2));
    }

    static int SmallestGreater(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        if (target > nums[nums.length - 1])
            return -1;

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
        return st;

    }
}
