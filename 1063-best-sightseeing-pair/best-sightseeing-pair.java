class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int score = Integer.MIN_VALUE;
        int m = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] - i + m > score) 
                score = values[i] - i + m;
            
            if (values[i] + i > m) 
                m = values[i] + i;
        }

        return score;
    }
}