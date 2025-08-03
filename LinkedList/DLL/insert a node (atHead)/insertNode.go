/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

func insertAtHead(head *ListNode, X int) *ListNode {
	return &ListNode{Val: X, Next: head}

	//this is how you intilaise a struct in go, it is equivalent to

	/*
	    var temp *ListNode          // declaration only
	temp = &ListNode{Val: X}    // assigned later

	*/
}
