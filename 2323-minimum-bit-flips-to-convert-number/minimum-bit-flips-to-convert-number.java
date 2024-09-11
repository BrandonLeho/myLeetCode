class Solution {
    public int minBitFlips(int start, int goal) {
        int counter = 0; 
        int xor = start ^ goal;
        while(xor!=0){
            counter += xor & 1;
            xor >>=1;
        }
        return counter;

    }
}