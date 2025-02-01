class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true;

        int parity = 0;
        if(nums[0] % 2 != 0) parity = 1;

        for(int i = 1; i < nums.length; i++){
            if(parity == 0 && nums[i] % 2 != 0){
                parity = 1;
            }
            else if(parity == 1 && nums[i] % 2 == 0){
                parity = 0;
            }
            else{
                return false;
            }
        }
        return true;
    }
}