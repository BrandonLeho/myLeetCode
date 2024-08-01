class Solution {
    public int countSeniors(String[] details) {
        int output = 0;
        for(int i = 0; i < details.length; i++){
            if(details[i].charAt(11) - '0' >= 6){
                output++;
                if(details[i].charAt(11) - '0' == 6 && details[i].charAt(12) - '0' == 0){
                    output--;
                }
            }
        }
        return output;
    }
}