package heejeong;

// 21. Merge Two Sorted Lists
public class MergeSortedLists0326 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sort = new ListNode();

        if(l1==null && l2==null) {
            return null;
        }else{
            if (l1==null){
                return l2;
            }else if(l2==null){
                return l1;
            }else{
                // if l1 has next or l2 has next
                // compare each val
                // save sorted result into sort ListNode
                if(l1.val<l2.val){
                    sort.val = l1.val;
                    sort.next = mergeTwoLists(l1.next, l2);
                }else{
                    sort.val = l2.val;
                    sort.next = mergeTwoLists(l1, l2.next);
                }
            }
        }
        return sort;
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
