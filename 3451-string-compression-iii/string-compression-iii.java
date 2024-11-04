class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int count = 1;
        char c = word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            if (c == word.charAt(i) && count < 9) {
                count++;
            } else {
                comp.append((char) (count + '0')).append(c);
                count = 1;
                c = word.charAt(i);
            }

        }
        comp.append((char) (count + '0')).append(c);

        return comp.toString();
    }
}