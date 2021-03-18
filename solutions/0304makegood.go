func makeGood(s string) string {
    i := 0
    for i <= len(s) - 2{
        if math.Abs(float64(s[i]) - float64(s[i+1])) == float64(32) {
            s = s[:i] + s[i+2:]
            i = -1
        }
        i++
    }
    return s
}
