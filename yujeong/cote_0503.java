package yujeong;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class cote_0503 {
    public void deleteNode(ListNode node) {
        //꼬리 노드가 아닐 경우
        if(node.next!=null){
            node.val=node.next.val;
            node.next=node.next.next;
        }
    }
}
