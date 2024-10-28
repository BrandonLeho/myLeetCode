class Solution {
    public int longestSquareStreak(int[] nums) {
        HashSet<Integer> squares = new HashSet<>();
        int max = 0;
        Arrays.sort(nums);

        for (int num : nums) {
            squares.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = 0, curr = nums[i];
            if (squares.contains((int) Math.pow(nums[i], 2))) {
                do {
                    temp++;
                    curr = (int) Math.pow(curr, 2);
                } while (squares.contains((int) Math.pow(curr, 2)));
            }
            max = Math.max(max, temp);
        }

        return max == 0 ? -1 : max + 1;
    }
}