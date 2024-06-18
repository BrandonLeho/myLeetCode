class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int output = 0, counter = 0, max = 0;
        int[] potentialProjects = new int[difficulty.length];

        for(int i = 0; i < worker.length; i++){
            for(int j = 0; j < difficulty.length; j++){
                if(worker[i] >= difficulty[j]){
                    potentialProjects[counter] = profit[j];
                    counter++;
                }
            }
            for(int j = 0; j < potentialProjects.length; j++){
                if(potentialProjects[j] >= max){
                    max = potentialProjects[j];
                }
            }
            output += max;
            max = 0;
            counter = 0;
            Arrays.fill(potentialProjects, 0);
        }
        return output;
    }
}