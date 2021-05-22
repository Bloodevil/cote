class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = head;
        int listSize = 0;
        int target = 0;
        // 순회하면서 list의 길이를 알아내기
        listSize = getListSize(dummy, listSize);
        target = listSize - n;

        // 예외 케이스 node가 하나 있을 경우
        if(listSize == 1 && target == 0) {
            head = null;
            return head;
        } else if(listSize > 1 && target == 0) {
            // [1,2] 2
            dummy = dummy.next;
            return dummy;
        }

        //n번째의 값 갈아끼우기
        for(int i = 1; i < target; i++) {
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;
        return head;
        /*
        target = 0
        -> for문 못들어감
        2 = null
        -> return 1
        but expected 2
        if(target == 0 && 1 < listSize)
        */

    }

    public int getListSize(ListNode dummy, int listSize) {
        while(dummy != null) {
            listSize++;
            dummy = dummy.next;
        }
        return listSize;

    }
}
/*
Runtime: 0 ms
Memory Usage: 36.9 MB
 */
