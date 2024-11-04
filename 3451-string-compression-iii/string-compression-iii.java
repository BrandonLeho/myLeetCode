class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int count = 1;
        char c = word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            char curr = word.charAt(i), num = (char) (count + '0');
            if (c == curr && count < 9) {
                count++;
            } else {
                comp.append(num).append(c);
                count = 1;
                c = curr;
            }

        }
        comp.append((char) (count + '0')).append(c);

        return comp.toString();
    }
}