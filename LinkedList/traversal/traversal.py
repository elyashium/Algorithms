# Definiton of singly Linked List
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def insertAtHead(self, head, X):
        temp = ListNode(X)
        temp.next = head
        return temp

        