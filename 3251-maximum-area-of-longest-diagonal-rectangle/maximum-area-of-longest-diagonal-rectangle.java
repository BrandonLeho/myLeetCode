class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = 0;
        double sqrtMax = 0;

        for(int i = 0; i < dimensions.length; i++)
            if(Math.sqrt(((dimensions[i][0] * dimensions[i][0]) + (dimensions[i][1] * dimensions[i][1]))) > sqrtMax){
                max = dimensions[i][0] * dimensions[i][1];
                sqrtMax = Math.sqrt(((dimensions[i][0] * dimensions[i][0]) + (dimensions[i][1] * dimensions[i][1])));
            }else if(Math.sqrt(((dimensions[i][0] * dimensions[i][0]) + (dimensions[i][1] * dimensions[i][1]))) == sqrtMax && dimensions[i][0] * dimensions[i][1] > max)
                max = dimensions[i][0] * dimensions[i][1];
            
        return max;
    }
}