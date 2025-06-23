package ARRAYS;


class Pivot {
    public int pivotIndex(int[] nums) {
        int r_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            r_sum = r_sum + nums[i];
        }
        int l_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            r_sum = r_sum - nums[i];
            if (r_sum == l_sum) {
                return i;
            }
            l_sum = l_sum + nums[i];
        }
        return -1;
    }
}