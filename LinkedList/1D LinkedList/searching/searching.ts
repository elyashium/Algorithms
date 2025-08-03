class ListNode {
    val: number;
    next: ListNode | null;

    constructor(val: number, next: ListNode | null = null) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    searchKey(head: ListNode | null, key: number): boolean {
        let temp = head;
        while (temp !== null) {
            if (temp.val === key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
