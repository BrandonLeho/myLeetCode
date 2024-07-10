public class Solution {
    public int MinOperations(string[] logs) {
        int output = 0;
        for(int i = 0; i < logs.Length; i++){
            if(!logs[i].Equals("../") && !logs[i].Equals("./"))
                output++;
            else if(logs[i].Equals("../") && i != 0 && output > 0)
                output--;
        }
        return output;
    }
}