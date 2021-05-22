class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode startNode = new ListNode();
        ListNode followNode = startNode;

        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                followNode.next = l2;
                l2 = l2.next;
            } else {
                followNode.next = l1;
                l1 = l1.next;
            }
            followNode = followNode.next;

        }
        if (l1 == null) followNode.next = l2;
        if (l2 == null) followNode.next = l1;

        return startNode.next;
    }
}
/*
Runtime: 0 ms
Memory Usage: 38.2 MB
 */
