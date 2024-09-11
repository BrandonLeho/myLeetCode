class Solution {
    public int minBitFlips(int start, int goal) {
        String biStart = Integer.toBinaryString(start), biGoal = Integer.toBinaryString(goal);
        int startLength = biStart.length(), goalLength = biGoal.length(), counter = 0;

        StringBuilder sb = new StringBuilder();

        if(startLength > goalLength){
            String leadingZero = "0".repeat(Math.abs(startLength - goalLength));
            sb.append(leadingZero).append(biGoal);
            biGoal = sb.toString();
        }
        else if(startLength < goalLength){
            String leadingZero = "0".repeat(Math.abs(startLength - goalLength));
            sb.append(leadingZero).append(biStart);
            biStart = sb.toString();
        }

        for(int i = biGoal.length()-1; i >= 0; i--){
            if(biStart.charAt(i) != biGoal.charAt(i)){
                counter++;
            }
        }

        return counter;

    }
}