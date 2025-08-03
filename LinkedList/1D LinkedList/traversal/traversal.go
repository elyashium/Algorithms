type ListNode struct {
    Val  int
    Next *ListNode
}

func getLength(head *ListNode) int {
    count := 0
    temp := head

    for temp != nil {
        count++
        temp = temp.Next
    }

    return count
}
