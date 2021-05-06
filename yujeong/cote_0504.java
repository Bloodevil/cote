package yujeong;

import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class cote_0504 {
    //목록 끝에서 n번째 노드 제거, front와 back 2개의 포인터를 만든다
    //listNode를 list로 변환해 값 제거 후 다시 listNode로 변환하는 방법은?
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front=head;
        ListNode back=head;

        while(front!=null){
            front=front.next;
            if(n--<0){
                back=back.next;
            }//if
        }//while

        if(n==0){
            head=head.next;
        }else if(n<0){
            back.next=back.next.next;
        }else{
            return null;
        }

        return head;
    }
}
