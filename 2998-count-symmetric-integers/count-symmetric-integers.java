class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++){
            int length = String.valueOf(i).length();
            if(length % 2 == 0){
                int halfLength = length / 2;
                int firstPart = i / (int) Math.pow(10, halfLength);
                int secondPart = i % (int) Math.pow(10, halfLength);
                int firstSum = 0;
                int secondSum = 0;
                
                while (firstPart > 0) {
                    firstSum += firstPart % 10; 
                    firstPart /= 10;     
                }

                while (secondPart > 0) {
                    secondSum += secondPart % 10; 
                    secondPart /= 10;     
                }

                if(firstSum == secondSum)
                    count++;
            }
        }
        return count;
    }
}