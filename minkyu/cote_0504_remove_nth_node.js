const removeNthFromEnd = (head, n) => {
  if (n === 0) {
      return head
  }
  
  let temp = head
  let length = 0
  
  while (temp.next) {
      length++
      temp = temp.next
  }
  
  length -= (n-1)
  let prev = null
  temp = head
  
  while (length > 0) {
      length--
      prev = temp
      temp = temp.next
  }
  
  if (prev) {
      prev.next = temp.next
      temp.next = null
  } else {
      return head.next
  }
  
  return head
}
