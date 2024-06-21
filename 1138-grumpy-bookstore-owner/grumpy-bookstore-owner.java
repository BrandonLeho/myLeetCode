class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = grumpy.length;
        int totalSatisfied = 0;
        
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                totalSatisfied += customers[i];
            }
        }
        
        int additionalSatisfied = 0;
        int maxAdditionalSatisfied = 0;
        
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                additionalSatisfied += customers[i];
            }
        }
        maxAdditionalSatisfied = additionalSatisfied;
        
        for (int i = minutes; i < n; i++) {
            if (grumpy[i - minutes] == 1) {
                additionalSatisfied -= customers[i - minutes];
            }
            if (grumpy[i] == 1) {
                additionalSatisfied += customers[i];
            }
            maxAdditionalSatisfied = Math.max(maxAdditionalSatisfied, additionalSatisfied);
        }
        
        return totalSatisfied + maxAdditionalSatisfied;
    }
}