class Solution {
    public int maxDistance(int[] position, int m) {
        int output = 0, n = position.length;
        Arrays.sort(position);
        if(m == 2){
            return position[n - 1] - position[0];
        }

        int low = 1, high = position[n - 1] / (m - 1);
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceBalls(mid, position, m)){
                output = mid;
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        
        return output;
    }

    public boolean canPlaceBalls(int x, int[] position, int m){
        int prevBallPos = position[0], ballsPlaced = 1;
        for(int i = 0; i < position.length && ballsPlaced < m; i++){
            int currPos = position[i];
            if (currPos - prevBallPos >= x) {
                ballsPlaced += 1;
                prevBallPos = currPos;
            }
        }
        return ballsPlaced == m;
    }
}