const getDecimalValue = (head) => {
  let total = 0

  while (head !== null) {
      total *= 2
      total += head.val
      head = head.next
  }
  
  return total
}
