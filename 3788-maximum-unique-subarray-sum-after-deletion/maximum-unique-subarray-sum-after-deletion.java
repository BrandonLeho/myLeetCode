class Solution {
    public int maxSum(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int[] num = new int[101];
        int sum = 0;
        int maxNeg = -100;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (nums[i] > maxNeg) {
                    maxNeg = nums[i];
                }
            } else if (num[nums[i]] != 1) {
                num[nums[i]] = 1;
                sum += nums[i];
            }
        }
        return sum == 0 && num[0] != 1 ? maxNeg : sum;
    }
}