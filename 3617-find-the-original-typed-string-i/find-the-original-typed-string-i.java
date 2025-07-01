class Solution {
    public int possibleStringCount(String word) {
        if (word.length() == 1)
            return 1;
            
        int count = 0;
        char c = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == c)
                count++;
            c = word.charAt(i);
        }

        return count + 1;
    }
}