package heejeong;

// 1290. Convert Binary Number in a Linked List to Integer
public class LinkedList0405 {
    //static 변수로 선언하여 동작할 경우, 개별 테스트케이스는 알맞은 값이 반환되지만,
    //여러 테스트케이스 진행 시 기존값이 남아서 누적된 값이 출력됨
    //메서드 안에서 해결할 것.

    static String decimal = "";
    public int getDecimalValue1(ListNode head) {
        decimal = head.val + "";
        if (head.next != null) {
            getDecimalValue1(head.next);
        }
        return Integer.parseInt(decimal, 2);
    }

    public int getDecimalValue2(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = num * 2 + head.next.val;
            head = head.next;
        }
        return num;
    }

    //기본 제공 ListNode class
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}