class Solution {
    public int minIncrementForUnique(int[] nums) {
        int output = 0, moves = 0; 
        Arrays.sort(nums);
        for (int i : nums) {
            moves = Math.max(moves, i);
            output += moves - i;
            moves += 1;
        }
        return output;
    }
}