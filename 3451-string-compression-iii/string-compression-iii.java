class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int count = 1;
        char c = word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            char curr = word.charAt(i), num = (char)(count + '0');
            if (c == curr) {
                if (count > 8) {
                    comp.append(num);
                    comp.append(c);
                    count = 0;
                }
                count++;

            } else {
                comp.append(num);
                comp.append(c);
                count = 1;
                c = curr;
            }

        }
        comp.append((char)(count + '0'));
        comp.append(c);

        return comp.toString();
    }
}