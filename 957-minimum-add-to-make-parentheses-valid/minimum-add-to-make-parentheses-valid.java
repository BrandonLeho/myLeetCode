class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length() == 0) return 0;
        int open = 0, closed = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                open++;
            }
            else if(c == ')' && open > 0){
                open--;
            }
            else{
                closed++;
            }
        }

        return open + closed;
    }
}