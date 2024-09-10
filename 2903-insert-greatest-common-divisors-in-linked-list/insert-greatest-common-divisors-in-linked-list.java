/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head, c = head;
        int position = 1, n = 0;

        while (c != null) {
            n++;
            c = c.next;
        }

        for(int i = 0; i < n - 1; i++){
            int gcd = findGCD(current.val, current.next.val);
            head = insertAtPosition(head, gcd, position);
            position += 2;
            current = current.next.next;
        }
        return head;
    }

    public ListNode insertAtPosition(ListNode head, int value, int position) {
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < position - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }

        return head;
    }

    public int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}