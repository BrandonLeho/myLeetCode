class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == queries[i][1]) {
                answer[i] = arr[queries[i][0]];
            } else {
                int binary = 0;
                for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                    binary ^= arr[j];
                }
                answer[i] = binary;
            }
        }
        return answer;
    }
}