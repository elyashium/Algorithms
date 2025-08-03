class ListNode {
    val: number;
    next: ListNode | null;

    constructor(val: number, next: ListNode | null = null) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    getLength(head: ListNode | null): number {
        let count = 0;
        let temp = head;

        while (temp !== null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}
