class Solution {
    public int minOperations(String[] logs) {
        int output = 0;
        for(int i = 0; i < logs.length; i++){
            if(!logs[i].equals("../") && !logs[i].equals("./"))
                output++;
            else if(logs[i].equals("../") && i != 0 && output > 0)
                output--;
        }
        return output;
    }
}