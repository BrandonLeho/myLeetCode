public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.Length + nums2.Length];
        Array.Copy(nums1, 0, nums, 0, nums1.Length);
        Array.Copy(nums2, 0, nums, nums1.Length, nums2.Length);
        Array.Sort(nums);

        if (nums.Length % 2 != 0) {
            return (double)nums[nums.Length / 2];
        }
        return ((double)nums[(nums.Length - 1) / 2] + nums[nums.Length / 2]) / 2.0;
    }
}
