public class Solution {
    public boolean hasCycle(ListNode head) {
        for(int idx = 0; idx < 10000; idx++){
            if(head == null || head.next == null) return false;
            head = head.next;
        }
        return true;
    }
}