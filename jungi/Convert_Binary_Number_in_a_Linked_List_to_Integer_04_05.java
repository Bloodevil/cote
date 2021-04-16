/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int answer = head.val;
        while(head.next != null){
            answer = answer * 2 + head.next.val;
            head = head.next;
        }
        return answer;
        /*
        sudo code
        Singly- linked list 인 ListNode가 주어지고
        head가 주어진다.
        예제 1번은 1 -> 0 -> 1
        이번 head 즉 LintNode의 val = 1
        head.next.val = 0
        head.next.next.val = 1

        여기서 요구하는 것은 2진수 형식으로 되어있는 linked list를
        2진수 방식으로 자리수를 더해 정수형의 값으로 return하는 것

        어떻게 할 것인가.

        testcase를 1,1,0,0
        1*2^3 + 1*2^2 + 0*2^1 + 0*2^0
        answer = head.val
        -> 0,0,1,1인 상황이라면? 1,1,0,0
        if(head.next != null)
        ->answer = answer * 2
        0 ->0...0...0 -> X
        1 -> 2...4....8 -> X

        answer = head.val
        if(head.next != null)
        answer = answer * 2 + head.next.val
        head = head.next;
        0 -> 0(0*2+0) -> 0(0*2+1) -> 3(1*2+1) -> (null) -> out return 3

        */

    }
}