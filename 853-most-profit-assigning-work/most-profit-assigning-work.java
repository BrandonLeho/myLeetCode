class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        Integer[] job = new Integer[n];

        for (int i = 0; i < n; i++) {
            job[i] = i;
        }

        Arrays.sort(job, (a, b) -> difficulty[a] - difficulty[b]);
        Arrays.sort(worker);

        int maxProfit = 0;
        int i = 0;
        int best = 0;
        int output = 0;

        for (int w : worker) {
            while (i < n && w >= difficulty[job[i]]) {
                best = Math.max(best, profit[job[i]]);
                i++;
            }
            output += best;
        }
        return output;
    }
}