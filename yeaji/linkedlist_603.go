func removeNthFromEnd(head *ListNode, n int) *ListNode {
    result := head
    m := 0
    for head != nil {
        m += 1
        head = head.Next
    }
    if m == 1 && n == 1 {
        return nil
    }
    head = result
    m = m-n
    for head != nil {
        if m == 0{
            head.Val = head.Next.Val
            head.Next = head.Next.Next
            return result
        } else if (m == 1 && head.Next.Next == nil) {
            head.Next = nil
            return result
        }
        head = head.Next
        m -= 1
    }
    return result
}
