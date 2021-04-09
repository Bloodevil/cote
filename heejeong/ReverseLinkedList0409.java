package heejeong;

public class ReverseLinkedList0409 {
    public ListNode reverseList(ListNode head) {
        // 노드가 없거나 1개일 때
        if(head == null || head.next == null){
            return head;
        }

        // 노드가 2개 이상일 때
        // temp 이용했던 것처럼, 담아 둘 ListNode 변수를 생성해서 풀이할 수 있다.
        ListNode current, prev, next;
        current = head;
        prev =  null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}

class ListNode {
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
