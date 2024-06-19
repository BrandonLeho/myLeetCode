public class Solution {
    public int MinDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.Length) {
            return -1;
        }

        int left = 1, right = (int) 1e9;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private bool canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int total = 0;

        for (int i = 0; i < bloomDay.Length; i++) {
            int count = 0;
            while (i < bloomDay.Length && count < k && bloomDay[i] <= day) {
                count++;
                i++;
            }

            if (count == k) {
                total++;
                i--;
            }

            if (total >= m) {
                return true;
            }
        }

        return false;
    }
}