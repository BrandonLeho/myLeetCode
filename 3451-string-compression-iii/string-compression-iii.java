class Solution {
    public String compressedString(String word) {
        List<Character> compList = new ArrayList<>();
        StringBuilder comp = new StringBuilder();
        int count = 1;
        char c = word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            char curr = word.charAt(i);
            if (c == curr) {
                if (count > 8) {
                    compList.add((char)(count + '0'));
                    compList.add(c);
                    count = 0;
                }
                count++;

            } else {
                compList.add((char)(count + '0'));
                compList.add(c);
                count = 1;
                c = curr;
            }

        }
        compList.add((char)(count + '0'));
        compList.add(c);

        for (char ch : compList) {
            comp.append(ch);
        }

        return comp.toString();
    }
}