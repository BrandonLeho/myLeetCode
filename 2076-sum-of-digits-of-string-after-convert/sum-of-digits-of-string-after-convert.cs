public class Solution {
    public int GetLucky(string s, int k) {
        int sum = 0;
        for(int i = 0; i < s.Length; i++){
            int convert = (int)(s[i]) - 96;
            sum += convert / 10;
            sum += convert % 10;
        }
        if(k > 1){
            for(int i = 1; i < k; i++){
                int tempSum = 0;
                tempSum += (sum / 1000) % 10;
                tempSum += (sum / 100) % 10;
                tempSum += (sum / 10) % 10;
                tempSum += sum % 10;
                sum = tempSum;
            }
        }
        return sum;
    }
}