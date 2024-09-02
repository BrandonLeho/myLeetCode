class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        if(chalk.length == 1) return 0;
        int n = 0;
        while(k > 0){
            k -= chalk[n];
            if(k < 0) return n;
            n++;
            if(n > chalk.length - 1) n = 0;
        }
        return n;
    }
}