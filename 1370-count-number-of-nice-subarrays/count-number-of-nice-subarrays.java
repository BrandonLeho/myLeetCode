class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int output = 0, n = nums.length, odds = 0;
        int[] count = new int[n + 1];
        count[0] = 1;
        for(int isOdd : nums){
            odds += isOdd & 1;
            if(odds - k >= 0){
                output += count[odds - k];
            }
            count[odds]++;
        }
        return output;
    }
}