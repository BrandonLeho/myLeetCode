class Solution {
    public boolean check(int[] nums) {
        if (nums.length < 3)
            return true;

        int decreased = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                decreased++;
            if (decreased == 2)
                return false;
        }

        if (decreased == 1 && nums[0] < nums[nums.length - 1])
            return false;

        return true;
    }
}