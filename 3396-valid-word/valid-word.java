class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3)
            return false;
        boolean vowel = false;
        boolean consonant = false;
        for(int i = 0; i < word.length(); i++){
            if (Character.isLetter(word.charAt(i))) {
                if ("aeiouAEIOU".indexOf(word.charAt(i)) != -1) {
                    vowel = true;
                } else {
                    consonant = true;
                }
            } else if (!Character.isDigit(word.charAt(i))) {
                return false;
            }
        }
        return vowel && consonant;
    }
}