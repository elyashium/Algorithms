class ListNode {
    val: number;
    next: ListNode | null;

    constructor(val?: number, next?: ListNode | null) {
        this.val = val === undefined ? 0 : val;
        this.next = next === undefined ? null : next;
    }
}

function reverseList(head: ListNode | null): ListNode | null {
    let previous: ListNode | null = null;
    let current = head;

    while (current !== null) {
        const nextNode = current.next;
        current.next = previous;
        previous = current;
        current = nextNode;
    }

    return previous;
}
