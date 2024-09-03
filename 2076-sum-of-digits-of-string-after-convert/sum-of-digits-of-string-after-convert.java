class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int convert = (int)(s.charAt(i)) - 96;
            sum += convert / 10;
            sum += convert % 10;
        }
        if(k > 1){
            for(int i = 1; i < k; i++){
                int tempSum = 0;
                while (sum != 0) {
                    tempSum += sum % 10;
                    sum /= 10;
                }
                sum = tempSum;
            }
        }
        return sum;
    }
}