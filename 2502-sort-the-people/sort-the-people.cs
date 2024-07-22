public class Solution {
    public string[] SortPeople(string[] names, int[] heights) {
        for (int i = 0; i < heights.Length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < heights.Length; j++) {
                if (heights[j] > heights[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = heights[maxIdx];
            heights[maxIdx] = heights[i];
            heights[i] = temp;

            String Temp = names[maxIdx];
            names[maxIdx] = names[i];
            names[i] = Temp;
        }
        return names;
    }
}