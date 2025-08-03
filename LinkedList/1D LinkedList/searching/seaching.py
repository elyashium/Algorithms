class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def searchKey(self, head: ListNode, key: int) -> bool:
        temp = head
        while temp:
            if temp.val == key:
                return True
            temp = temp.next
        return False
