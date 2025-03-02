class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums1.length; i++) {
            nums.put(nums1[i][0], nums1[i][1]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (nums.containsKey(nums2[i][0])) {
                nums.put(nums2[i][0], nums2[i][1] + nums.get(nums2[i][0]));
            } else {
                nums.put(nums2[i][0], nums2[i][1]);
            }

        }

        int[][] output = new int[nums.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : nums.entrySet()) {
            output[i][0] = entry.getKey();
            output[i][1] = Integer.valueOf(entry.getValue());
            i++;
        }

        Arrays.sort(output, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        return output;
    }
}