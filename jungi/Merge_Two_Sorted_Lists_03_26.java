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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        // 접근
        // 두 ListNode를 합치는 문제
        // l1.val compare l2.val
        // 작은것을 answer에 넣고 next는 큰 수를 가리킨다.
        // 일단 null처리 부터
        // 관련 Topics 보니 Recursion이 있다 재귀로 풀어보자

        if(l1 == null) return l2;
        if(l2 == null) return l1;


        // answer 생성
        ListNode answer;

        // 비교 작으면 작은게 현재 답에 들어가고 큰 수가 다음(next)에 들어감
        if(l1.val < l2.val)
        {
            answer = l1;
            answer.next = mergeTwoLists(answer.next, l2);
        }
        else
        {
            answer = l2;
            answer.next = mergeTwoLists(answer.next, l1);
        }

        return answer;

    }
}