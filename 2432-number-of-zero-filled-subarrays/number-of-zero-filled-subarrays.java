class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                curr++;
                count += curr;
            }else{
                curr = 0;
            }
        }
        return count;
    }
}