const reverList = (head) => {
  if (!head || !head.next) {
      return head
  }

  const next = reverseList(head.next)
  head.next.next = head
  head.next = null

  return next
}
