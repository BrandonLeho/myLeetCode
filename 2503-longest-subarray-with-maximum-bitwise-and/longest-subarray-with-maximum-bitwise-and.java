class Solution {
    public int longestSubarray(int[] nums) {
        int output = 1, max = 0, counter = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                output = 1;
                counter = 1;
            }
            else if(nums[i] == nums[i-1] && nums[i] == max){
                counter++;
            }
            else{
                counter = 1;
            }
            output = Math.max(counter, output);
        }
        return output;
    }
}