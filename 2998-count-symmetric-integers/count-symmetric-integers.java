class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        int length = 0;
        int halfLength = 0;
        int firstPart = 0;
        int secondPart = 0;
        int firstSum = 0;
        int secondSum = 0;
        
        for(int i = low; i <= high; i++){
            length = String.valueOf(i).length();
            if(length % 2 == 0){
                halfLength = length / 2;
                firstPart = i / (int) Math.pow(10, halfLength);
                secondPart = i % (int) Math.pow(10, halfLength);
                firstSum = 0;
                secondSum = 0;
                
                while (firstPart > 0) {
                    firstSum += firstPart % 10; 
                    firstPart /= 10;
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