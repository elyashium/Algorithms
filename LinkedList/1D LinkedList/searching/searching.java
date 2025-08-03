class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public boolean searchKey(ListNode head, int key) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
