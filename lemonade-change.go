func lemonadeChange(bills []int) bool {
    changes := map[int]int{5:0, 10:0}
    for _, bill := range bills {
        if bill == 10 {
            if changes[5] >= 1 {
                changes[5]--
            } else{
                return false
            }
            changes[10]++
        } else if bill == 5 {
            changes[5]++
        } else { //20
            if changes[10] >0 && changes[5] > 0 {
                changes[10]--
                changes[5]--
            } else if changes[5] >= 3{
                changes[5] = changes[5] - 3
            } else {
                return false
            }
        }
    }
    return true
}
