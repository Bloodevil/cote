
/*
정답을 봐버려서 이 코드 생각만 나서 그냥 그대로 따라쳐봤습니다 코드를 보면 무슨말인진 알겠는데
막상 짜려니 손이 안나가네요 ㅠㅠ
 */
class Solution {
    public int dfs(int prev, int index, int[] numbers, int target) {

        if (index >= numbers.length) {
            if (target == prev) {
                return 1;
            }
            return 0;
        }

        int plus = prev + numbes[index];
        int minus = prev - numbes[index];

        int answer = 0;
        answer += dfs(plus, index+1, numbers, target);
        answer += dfs(minus, index+1, numbers, target);
    }

    public int solution(int[] numbers, int target) {
        int currentValue = numbers[0];
        int result = 0;
        result += dfs(currentValue, 1, numbers, target);
        result += dfs(-currentValue, 1, numbers, target);
        return answer;
    }
}