class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int output = 0, sum = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(sum, 1);

        for(int i = 0; i < nums.length; i++){
            sum += nums[i] % 2;
            if(prefixSum.containsKey(sum - k)){
                output += prefixSum.get(sum - k);
            }
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
        }
        return output;
    }
}