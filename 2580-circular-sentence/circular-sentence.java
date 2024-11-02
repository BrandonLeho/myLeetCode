class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence.charAt(sentence.length() - 1) != sentence.charAt(0)){ return false; }

        for(int i = 0; i < sentence.length(); i++){
            char c =  sentence.charAt(i);
            if(c == ' ' && i > 0 && i < sentence.length()){
                if(sentence.charAt(i - 1) != sentence.charAt(i + 1)){
                    return false;
                }
            }
        }
        return true;
    }
}