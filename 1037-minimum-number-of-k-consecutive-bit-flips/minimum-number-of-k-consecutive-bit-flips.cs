public class Solution {
    public int MinKBitFlips(int[] nums, int k) {
        int output = 0, n = nums.Length, flipped = 0;
        int[] sub = new int[n];

        for(int i = 0; i < n; i++){
            if(i >= k){
                flipped ^= sub[i-k];
            }
            if(flipped == nums[i]){
                if(i + k > n){
                    return -1;
                }
                sub[i] = 1;
                flipped ^= 1;
                output++;
            }
        }
        return output;
    }
}