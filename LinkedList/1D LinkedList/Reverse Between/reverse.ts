class ListNode {
    val: number;
    next: ListNode | null;

    constructor(val?: number, next?: ListNode | null) {
        this.val = val === undefined ? 0 : val;
        this.next = next === undefined ? null : next;
    }
}

function reverseBetween(head: ListNode | null, left: number, right: number): ListNode | null {
    if (head === null || left === right) {
        return head;
    }

    const dummy = new ListNode(0, head);
    let prev: ListNode = dummy;

    // Move prev to the node before 'left'
    for (let i = 0; i < left - 1; i++) {
        if (prev.next !== null) {
            prev = prev.next;
        }
    }

    let cur: ListNode | null = prev.next;

    // Reverse sublist in-place
    for (let i = 0; i < right - left; i++) {
        const temp = cur!.next!;
        cur!.next = temp.next;
        temp.next = prev.next;
        prev.next = temp;
    }

    return dummy.next;
}
