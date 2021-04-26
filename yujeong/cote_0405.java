package yujeong;

//Definition for singly-linked list
class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class cote_0405 {
    public int getDecimalValue(ListNode head) {
        /*
            2진수를 10진수로!
        */
        StringBuilder sb = new StringBuilder();
        
        while(head!=null){
            sb.append(head.val);
            head = head.next;
        }
        
        return Integer.parseInt(sb.toString() , 2);
    }
}

