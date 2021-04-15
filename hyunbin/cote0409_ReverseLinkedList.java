class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class cote0409_ReverseLinkedList{
    public ListNode reverseList(ListNode head) {
        /*
        Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?

        Pascal's triangle    
        f(i, j) = f(i-1, j-1)+f(i-1, j)

        base case - 
        f(i, j) = 1 where j=1 or j=i

        q1. do i have to make a pascal's triangle with this problem?

        ListNode fifth = new ListNode(5, null);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        ListNode node = fifth;
        while(node != null){
            System.out.println(fifth.val);
        }
        //to reverse this
        
        when you do this, you'd get the result as '[5, 4, 5]' 
        ListNode answer = new ListNode(fifth.val, fourth);
        fourth = new ListNode(fourth.val, third);
        third = new ListNode(third.val, second);
        second = new ListNode(second.val, first);
        first = new ListNode(first.val, null);

        while(answer != null){
            System.out.println(answer.val);
            answer = answer.next;
        }
        */

        /*
        when you do these two cases, you'd get the result as '[5, 4, 3, 2, 1]' 

        1) make new ListNodes
        first = new ListNode(first.val, null);
        second = new ListNode(second.val, first);
        third = new ListNode(third.val, second);
        fourth = new ListNode(fourth.val, third);
        ListNode answer = new ListNode(fifth.val, fourth);

        while(answer != null){
            System.out.println(answer.val);
            answer = answer.next;
        }

        2) change only next nodes
        ListNode answer = new ListNode(fifth.val, fourth);
        fourth.next=third;
        third.next=second;
        second.next=first;
        first.next=null;

        while(answer != null){
            System.out.println(answer.val);
            answer = answer.next;
        }
        */

        /*
        make the last node to the head node
        while(node != null){
            if(node.next == null){
                answer = node;
            }
            node = node.next;
        }
        */
                
       // changeNode(head);

        ListNode answer = null;
        ListNode curr = head;
        //make the last node to the head node
        
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = answer;
            answer = curr;
            curr = temp;
        }

        return answer;
    }
    /* sapzil
    //save the before-node each step and exchange order
    public static void changeNode(ListNode curNode){
        ListNode save = curNode; //beforeNode
        curNode = curNode.next; //ready to next recursive function
        curNode.next = save; //exchange Node order
        changeNode(curNode);
    }
    */

    /////////// solution with recursive function
    public ListNode reverseList2(ListNode head){
        if(head == null || head.next == null) return head; // do not have any more comparison
        ListNode p = reverseList2(head.next); 
        head.next.next = head;
        head.next = null;
        return p;
    }
}