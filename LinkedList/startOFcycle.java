public class startOFcycle {
    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 

            if (slow == fast) { 
                // Find the start of the cycle
                slow = head; // slow = 1, reseting one pointer

                while (slow != fast) {
                    slow = slow.next; 
                    fast = fast.next; 
                }
                return slow; // Start of the cycle
            }
        }

        return null; // No cycle found
    }
}
