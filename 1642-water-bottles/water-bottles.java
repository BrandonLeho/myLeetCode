class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + (int)((numBottles - 1) / (numExchange - 1));
    }
}