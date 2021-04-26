# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        val = []
        while head.next != None:
            val.append(str(head.val))
            head = head.next
        val.append(str(head.val))
        val_str = "".join(val)
        return int(val_str,2)
