class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increasing = 1, decreasing = 1, max = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                increasing++;
                if (increasing > max)
                    max = increasing;
            } 
            else
                increasing = 1;

            if (nums[i] > nums[i + 1]) {
                decreasing++;
                if (decreasing > max)
                    max = decreasing;
            } 
            else
                decreasing = 1;
        }
        return max;
    }
}