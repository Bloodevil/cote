import { ListNode } from "./type";

function deleteDuplicates(head: ListNode | null): ListNode | null {
  if (!head || !head.next || !head.next.next) return head;
  const copyHead = head;

  while (head.next) {
    head.val === head.next.val ? (head.next = head.next.next) : (head = head.next);
  }

  return copyHead;
}
