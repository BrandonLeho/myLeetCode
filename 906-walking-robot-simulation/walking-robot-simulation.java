class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int distance = 0, x = 0, y = 0, direction = 0;
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        for (int command : commands) {
            if (command == -1) {
                direction = (direction + 1) % 4;
            } else if (command == -2) {
                direction = (direction + 3) % 4;
            } else {
                int dx = dirs[direction][0];
                int dy = dirs[direction][1];
                for (int k = 0; k < command; k++) {
                    int nx = x + dx;
                    int ny = y + dy;
                    if (obstacleSet.contains(nx + "," + ny)) {
                        break;
                    }
                    x = nx;
                    y = ny;
                    distance = Math.max(distance, x * x + y * y);
                }
            }
        }

        return distance;
    }
}
