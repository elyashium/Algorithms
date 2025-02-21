
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
    public ListNode reverseList(ListNode head) {

        //iterative 
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;   // Store next node
            current.next = previous; // Reverse the current node's pointer
            previous = current;    // Move pointers one position ahead
            current = next;
        }

        head = previous; // Previous will be the new head after the loop
        return head;

    }
}