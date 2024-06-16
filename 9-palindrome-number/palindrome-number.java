class Solution {
    public boolean isPalindrome(int x) {
        String input = Integer.toString(x);
        int n = String.valueOf(x).length() - 1;
        for(int i = 0; i < n; i++){
            if(input.charAt(i) != input.charAt(n - i)){
                return false;
            }
        }
        return true;
    }
}