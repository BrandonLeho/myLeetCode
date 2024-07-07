public class Solution {
    public int NumWaterBottles(int numBottles, int numExchange) {
        return numBottles + (int)((numBottles - 1) / (numExchange - 1));
    }
}