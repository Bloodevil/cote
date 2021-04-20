import "fmt"

func isHappy(n int) bool {
    if n == 1 {
        return true
    } else if n <= 5 {
        return false
    }
    next := 0
    for n > 0 {
        next += (n % 10)*(n % 10)
        n = n / 10
    }
    return isHappy(next)
}
