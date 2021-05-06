package heejeong;

public class RemoveNth0504 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        ListNode front = head;
        ListNode node = head;
        int cnt = 1;
        while(head.next != null){
            cnt++;
            head = head.next;
        }

        int nth = 0;
        while(node.next != null){
            if(n == 1 && node.next == head){
                node.next = null;
                return front;
            }

            int nthFromEnd = cnt - nth;
            if (nthFromEnd == n){
                node.val = node.next.val;
                if(n == 2){
                    node.next = null;
                    return front;
                }
                node.next = node.next.next;
            }
            node = node.next;
            nth++;
        }
        return front;
    }
    /*
    class ListNode{
        int val;
        ListNode next;
        public ListNode() {
        }
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    */
}
