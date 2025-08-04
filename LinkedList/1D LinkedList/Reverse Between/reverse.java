type ListNode struct {
    Val  int
    Next *ListNode
}

func reverseBetween(head *ListNode, left int, right int) *ListNode {
    if head == nil || left == right {
        return head
    }

    dummy := &ListNode{Val: 0, Next: head}
    prev := dummy

    // Move prev one node before left
    for i := 0; i < left-1; i++ {
        prev = prev.Next
    }

    cur := prev.Next

    // In-place reversal of sublist
    for i := 0; i < right-left; i++ {
        temp := cur.Next
        cur.Next = temp.Next
        temp.Next = prev.Next
        prev.Next = temp
    }

    return dummy.Next
}
