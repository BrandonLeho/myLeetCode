/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] a = new int[m][n];
        int direction = 0, r = 0, c = 0, corner = 0;

        for (int i = 0; i < m * n; i++) {
            switch (direction) {
                case 0: // right
                    if (head != null) {
                        a[r][c] = head.val;
                        head = head.next;
                    } else {
                        a[r][c] = -1;
                    }

                    if (c + 1 >= n - corner) {
                        direction++;
                        r++;
                    } else {
                        c++;
                    }
                    break;

                case 1: // down
                    if (head != null) {
                        a[r][c] = head.val;
                        head = head.next;
                    } else {
                        a[r][c] = -1;
                    }

                    if (r + 1 >= m - corner) {
                        direction++;
                        c--;
                    } else {
                        r++;
                    }
                    break;

                case 2: // left
                    if (head != null) {
                        a[r][c] = head.val;
                        head = head.next;
                    } else {
                        a[r][c] = -1;
                    }

                    if (c - 1 < 0 + corner) {
                        direction++;
                        r--;
                    } else {
                        c--;
                    }
                    break;
                case 3: // up
                    if (head != null) {
                        a[r][c] = head.val;
                        head = head.next;
                    } else {
                        a[r][c] = -1;
                    }

                    if (r - 1 <= 0 + corner) {
                        direction = 0;
                        c++;
                    } else {
                        r--;
                        if (r - 1 <= 0 + corner) {
                            corner++;
                        }
                    }
                    break;
            }
        }
        return a;
    }
}