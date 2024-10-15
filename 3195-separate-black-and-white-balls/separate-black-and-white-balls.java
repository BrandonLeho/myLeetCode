class Solution {
    public long minimumSteps(String s) {
        long swaps = 0;
        int n = s.length(), count = 1;;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                swaps += n - (i + count);
                count++;
            }
        }
        return swaps;
    }
}