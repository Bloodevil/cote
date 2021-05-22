import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode node = head; // 헤드의 첫번째 부분을 체크하기 위한 node

        Stack<Integer> stack = new Stack<Integer>();

        while(head != null) {	// Time complexity O(N), space complexity O(N)
            stack.push(head.val);
            head = head.next;
        }

        while(!stack.isEmpty()) { // Time complexity O(N), space complexity O(N)
            if(node.val != stack.pop()) return false;
            node = node.next;
        }
        // Time complexity O(2N), space complexity O(2N) -> O(N) O(N)
        // 가장 큰 범위가 10만이므로 stack에 10만개 넣고
        // stack이 빌 때까지 pop하지만 if문에서 걸릴것이므로 회문일 경우 최악-> 5만
        // 15만 연산 + stack에 10만개의 값 저장
        return true;
    }
}
/*
Runtime: 10 ms
Memory Usage: 51.2 MB
 */

