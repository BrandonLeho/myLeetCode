public class Solution {
    public int NumberOfSubarrays(int[] nums, int k) {
        int output = 0, sum = 0;
        Dictionary<int, int> prefixSum = new Dictionary<int, int>();
        prefixSum[sum] = 1;

        for (int i = 0; i < nums.Length; i++){
            sum += nums[i] % 2;
            if (prefixSum.ContainsKey(sum - k)){
                output += prefixSum[sum - k];
            }
            if (prefixSum.ContainsKey(sum)){
                prefixSum[sum]++;
            }
            else{
                prefixSum[sum] = 1;
            }
        }
        return output;
    }
}