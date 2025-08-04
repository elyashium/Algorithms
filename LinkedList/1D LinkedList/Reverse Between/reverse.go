/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func reverseBetween(head *ListNode, left int, right int) *ListNode {

	  if (head == null || left == right) {
            return head;
        }
    
	var temp *ListNode = &ListNode{Val:0, Next:head}
	var Dummy *ListNode = &ListNode{val:temp}
	//going back one node behind
	int i =0;
	for i<left-1{
		prev = prev.Next;
	}

	var curr ListNode* = &ListNode{Val:prev.next}
	for right-left{
		
	}

}