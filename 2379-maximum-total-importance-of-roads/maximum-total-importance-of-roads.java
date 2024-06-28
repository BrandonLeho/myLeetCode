class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long output = 0, value = 1;
        long[] importance = new long[n];

        for(int[] city : roads){
            importance[city[0]]++;
            importance[city[1]]++;
        }

        Arrays.sort(importance);

        for(long i : importance){
            output += (value * i);
            value++;
        }

        return output;
    }
}