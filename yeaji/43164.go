import (
    "sort"
)
var (
    result []string
    check  []bool
)

func solution(tickets [][]string) []string {
    check = make([]bool, len(tickets))
    sort.Slice(tickets, func(i, j int) bool {
        return tickets[i][1] < tickets[j][1]
    })
    dfs("ICN", tickets, 0)
    return result

}
func dfs(tmp string, tickets [][]string, cnt int) bool {
    result = append(result, tmp)
    if cnt == len(tickets) {
        return true
    }
    for i := 0; i < len(tickets); i++ {
        if tickets[i][0] == tmp && check[i] == false {
            check[i] = true
            visit := dfs(tickets[i][1], tickets, cnt+1)
            if visit {
                return true
            }
            check[i] = false
        }
    }
    result = result[:len(result)-1]
    return false
}
