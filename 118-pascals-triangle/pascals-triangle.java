class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        int[][] triangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        for (int[] row : triangle) {
            List<Integer> innerList = new ArrayList<>();
            for (int element : row) {
                innerList.add(element);
            }
            output.add(innerList);
        }

        return output;
    }
}