
//  Definition for singly-linked list.
  class ListNode {
      val: number
      next: ListNode | null
      constructor(val?: number, next?: ListNode | null) {
          this.val = (val===undefined ? 0 : val)
          this.next = (next===undefined ? null : next)
      }
 }
 

function deleteDuplicates(head: ListNode | null): ListNode | null {
    // 중복제거, 리스트는 순서대로 정렬되어 있음.  
    // 다음노드의 값이 헤드의 값이랑 같은지 다른지 비교한다. 
    // 다르면 헤드노드를 바까준다 
    // 같으면 다음노드의 다음노드를 넥스트로 선택한다 
    // next가 null이면 끝! 
    let nextNode;
    let firstNode = head;

    while(head && head.next){
        nextNode = head.next;

        if(!nextNode){
            return firstNode;
        }

        if(head.val === nextNode.val){
            head.next = nextNode.next;
        }else{
            head = head.next;
        }    
    }

    return firstNode;

};