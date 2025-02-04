class Solution {
    public int maxAscendingSum(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int max = nums[0], curr = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1])
                curr = 0;
            else if (nums[i] > nums[i - 1]) {
                if (curr == 0)
                    curr += nums[i - 1];
                curr += nums[i];
                if (curr > max)
                    max = curr;
            }
        }

        return max;
    }
}