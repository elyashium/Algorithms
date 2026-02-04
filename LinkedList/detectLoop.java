class hasCycle{
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

     public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow ){
                return true;
            }
        }
        return false;
    }
}