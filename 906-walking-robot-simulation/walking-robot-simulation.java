class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int distance = 0, x = 0, y = 0, direction = 0;
        
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == -1) {  // turn right
                direction++;
                if (direction == 4) direction = 0;
            } else if (commands[i] == -2) {  // turn left
                direction--;
                if (direction == -1) direction = 3;
            } else {  // move forward
                switchLoop:
                switch (direction) {
                    case 0: // north
                        for (int step = 1; step <= commands[i]; step++) {
                            if (obstacleSet.contains(x + "," + (y + step))) {
                                y += (step - 1);
                                break switchLoop;
                            }
                        }
                        y += commands[i];
                        break;
                    case 1: // east
                        for (int step = 1; step <= commands[i]; step++) {
                            if (obstacleSet.contains((x + step) + "," + y)) {
                                x += (step - 1);
                                break switchLoop;
                            }
                        }
                        x += commands[i];
                        break;
                    case 2: // south
                        for (int step = 1; step <= commands[i]; step++) {
                            if (obstacleSet.contains(x + "," + (y - step))) {
                                y -= (step - 1);
                                break switchLoop;
                            }
                        }
                        y -= commands[i];
                        break;
                    case 3: // west
                        for (int step = 1; step <= commands[i]; step++) {
                            if (obstacleSet.contains((x - step) + "," + y)) {
                                x -= (step - 1);
                                break switchLoop;
                            }
                        }
                        x -= commands[i];
                        break;
                }
                distance = Math.max(distance, x * x + y * y);
            }
        }
        return distance;
    }
}
