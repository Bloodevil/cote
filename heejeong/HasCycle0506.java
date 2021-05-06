package heejeong;

import java.util.*;

public class HasCycle0506 {
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
        List<ListNode> nodeList = new LinkedList<>();
        while (head.next != null){
            if (nodeList.contains(head)){
                return true;
            }
            nodeList.add(head);
            head = head.next;
        }
        return false;
    }
    // 메모리 + 시간 모두 너무 많이 쓰임
    /*
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    */
}
