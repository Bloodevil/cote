func remove(s []int, i int) []int {
    s[len(s)-1], s[i] = s[i], s[len(s)-1]
    return s[:len(s)-1]
}

func findContentChildren(g []int, s []int) int {
    output := 0
    sort.Ints(s)

    for _, value := range s {
        index := -1
        for i, v := range g {
            if value >= v {
                output += 1
                index = i
                break
            }
        }
        if index >= 0 {
            g = remove(g, index)
        }
    }
    return output
}
