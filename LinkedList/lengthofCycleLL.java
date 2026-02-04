public int cycleLength(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            int count = 1;
            ListNode temp = slow.next;

            while (temp != slow) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    return 0; // no cycle
}
