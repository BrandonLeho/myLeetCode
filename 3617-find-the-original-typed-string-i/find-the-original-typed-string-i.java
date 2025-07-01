class Solution {
    public int possibleStringCount(String word) {
        if (word.length() == 1)
            return 1;

        int count = 0;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i-1))
                count++;
        }

        return count + 1;
    }
}