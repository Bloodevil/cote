# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if l1 == None:
            return l2
        elif l2 == None:
            return l1
        result = ListNode(l2.val)
        if l1.val < l2.val:
            result = ListNode(l1.val)
            l1 = l1.next
        else:
            l2 = l2.next
        result_next = result
        while l1 != None or l2 != None:
            if l1 == None:
                result_next.next = l2
                return result
            elif l2 == None:
                result_next.next = l1
                return result
            if l1.val > l2.val:
                new = ListNode(l2.val)
                result_next.next = new
                l2 = l2.next
            else:
                new = ListNode(l1.val)
                result_next.next = new
                l1 = l1.next
            result_next = result_next.next
        return result
