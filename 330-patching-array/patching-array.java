class Solution {
    public int minPatches(int[] nums, int n) {
        long patch = 1;
        int output = 0;
        int i = 0;
 
        while (patch <= n) {
            if (i < nums.length && nums[i] <= patch) {
                patch += nums[i];
                i++;
            } else {
                patch += patch;
                output++;
            }
        }

        return output;
    }
}