import { ListNode } from "./type";

function reorderList(head: ListNode | null): void {
  if (!head || !head.next || !head.next.next) return;

  let slow: ListNode | null = head;
  let fast = head.next;

  while (fast.next && fast.next.next) {
    slow = slow && slow.next;
    fast = fast.next.next;
  }
  // NOTE: slow을 중간값을 구해 slow 기준 뒤에 값을 reverse 시켜 slow 기준 앞의 값과 번 갈아가며 arr에 넣기
}
