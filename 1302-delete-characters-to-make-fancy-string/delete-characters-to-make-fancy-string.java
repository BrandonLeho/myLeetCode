class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        char c = sb.charAt(0);
        int count = 1;

        for(int i = 1; i < sb.length(); i++){
            char curr = sb.charAt(i);
            if(curr == c){
                count++;
                if(count > 2){
                    sb.deleteCharAt(i);
                    i--;
                }
            }
            else{
                c = curr;
                count = 1;
            }

        }

        return sb.toString();
    }
}