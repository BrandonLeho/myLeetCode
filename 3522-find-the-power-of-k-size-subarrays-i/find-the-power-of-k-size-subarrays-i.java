class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(nums.length == 1){
            int[] output = {nums[0]};
            return output;
        }
        int[] output = new int[nums.length - k + 1];

        for(int i = 0; i < output.length; i++){
            int curr = nums[i];
            for(int j = i + 1; j < k + i; j++){
                if(nums[j] != curr + 1){
                    output[i] = -1;
                    break;
                } else{
                    curr = nums[j];
                }
                
            }
            if(output[i] != -1){
                output[i] = curr;
            }
        }
        return output;
    }
}