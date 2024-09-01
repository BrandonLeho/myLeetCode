class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if( m*n != original.length ) return new int[0][];
        int count = 0;
        int[][] array = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = original[count];
                count++;
            }
        }
        return array;
    }
}