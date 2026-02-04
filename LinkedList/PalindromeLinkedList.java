public class PalindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // O(N) time, O(1) space palindrome check
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find middle using slow & fast pointers
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode secondHalf = reverse(slow.next);

        // 3. Compare both halves
        ListNode firstHalf = head;
        ListNode temp = secondHalf;

        boolean isPalindrome = true;
        while (temp != null) {
            if (firstHalf.val != temp.val) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        // 4. Restore list (optional but good practice)
        slow.next = reverse(secondHalf);

        return isPalindrome;
    }

    // Helper method to reverse a linked list
    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    // MAIN FUNCTION (entry point)
    public static void main(String[] args) {

        // Example: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(
            1,
            new ListNode(
                2,
                new ListNode(
                    2,
                    new ListNode(1)
                )
            )
        );

        boolean result = isPalindrome(head);
        System.out.println("Is Palindrome: " + result);
    }
}
