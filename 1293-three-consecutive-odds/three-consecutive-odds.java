class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3)
            return false;
        int odds = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                odds = 0;
            else
                odds++;
            if (odds == 3)
                return true;
        }
        return false;
    }
}