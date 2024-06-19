public class Solution {
    public bool IsPalindrome(int x) {
        string input = x.ToString();
        int n = input.Length - 1;
        for (int i = 0; i <= n / 2; i++) {
            if (input[i] != input[n - i]) {
                return false;
            }
        }
        return true;
    }
}