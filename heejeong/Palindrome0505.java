package heejeong;

import java.util.*;

public class Palindrome0505 {
    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }
        ListNode node = head;
        Stack<Integer> stack = new Stack<>();
        while(head.next != null){
            stack.push(head.val);
            head = head.next;
        }
        if (node.val != head.val){
            return false;
        }
        while (node.next != null){
            node = node.next;
            if (node.val != stack.pop()){
                return false;
            }
        }
        return true;
    }
    /*
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    */
}
