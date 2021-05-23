/*
https://leetcode.com/problems/find-eventual-safe-states/
Input: graph = [[1,2],[2,3],[5],[0],[5],[],[]]
Output: [2,4,5,6]
Explanation: The given graph is shown above.

Example 2:
Input: graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
Output: [4]
예제는 되는데! [[],[0,2,3,4],[3],[4],[]] 이 예제의 경우 안돌아갑니다.
왜인지 분석해보고 어떻게 고치면 될지 생각해 봅시다.
*/
func eventualSafeNodes(graph [][]int) []int {
    result := []int{}
    for i, _ := range graph{
        compare := 0
        stack := []int{}
        check := i
      for len(graph[check]) != 0 || len(stack) > 0 {    //len( list ) -> list의 갯수.
            compare += 1    
            stack = append(stack, graph[check]...)    // graph[check]의 경우 리스트여서 리스트 + 리스트 해줄때는 ...을 써줍니다.
            if compare > i {            
                break
            }
            check = stack[0]
            stack = stack[1:]            // 하나를 빼내고 지워줍니다.
        }
        if compare <= i {
            result = append(result, i)
        }
    }
    return result
}

/*
*/
