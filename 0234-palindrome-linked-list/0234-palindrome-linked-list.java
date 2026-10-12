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

    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode forward = current.next;

            current.next = prev;
            prev = current;
            current = forward;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find the middle
        ListNode mid = findMid(head);

        // 2. Reverse the second half
        ListNode head2 = reverseLL(mid);

        // 3. Compare both halves
        ListNode temp1 = head;
        ListNode temp2 = head2;

        while (temp2 != null) {
            if (temp1.val != temp2.val) {
                return false;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }
}