type ListNode struct {
    Val  int
    Next *ListNode
}

func searchKey(head *ListNode, key int) bool {
    temp := head
    for temp != nil {
        if temp.Val == key {
            return true
        }
        temp = temp.Next
    }
    return false
}
