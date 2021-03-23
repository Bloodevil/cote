/* testcase
        brown -> b yellow -> y
        b 9, y 1 -> [3, 3]
        b 10, y 2 -> [4, 3]
        b 12, y 3 -> [5, 3]
        b 12, y 4 -> [4, 4]
        b 16, y 5 -> [7, 3]
        b 14, y 6 -> [5, 4]

        규칙성?
        horizontal = if y % 2 == 0 -> (y / 2) + 2 else y + 2
        세로는 가로를 먼저 기준으로 하기 때문에 그 다음에 구하는게 맞는거 같음
        vertical = 음.. ?
        -> horizontal 24일경우 위 공식 아님
        b 16, y 9 -> [5, 5]
        7같은 소인수는 가로 = 7 + 2 세로 -> 1 + 2 [9, 3]이 될것
        핵심 방법은 소수면 ho = Y + 2 ver = 1 + 2 에라토스테네스의 체?
        else 24일 경우 6 * 4라는 얘기
        30분 초과 외부 자료 도움
        구글링 시작
        소인수분해 -> 24 => 2 * 2 * 2 * 3
        72 -> 2 * 2 * 2 * 3 * 3 -> 가로 세로 구분을 어떻게 지어야 하나 [11, 10]이겠지만
        brown =  (가로 * 2) + (세로 * 2) + 4 -> (1 * 2) + (1 * 2) + 4 -> 8
        24 -> (6 * 2) + (4 * 2) + 4 -> 24
        [1][h][h][h][1]
        [v][*][*][*][v]
        [1][h][h][h][1]
*/
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];  // 결과 배열 생성

        // 3 이하일 경우
        if(yellow <= 3)
        {
            answer[0] = yellow + 2;
            answer[1] = 3;
            return answer;
        }

        int limit = (int)Math.ceil(Math.sqrt(yellow)); //제곱근 반올림하여 최대치

        for(int i=1; i<=limit ; ++i)
        {
            if(yellow % i == 0) { // 약수 구하기
                answer[0] = yellow/i;
                answer[1] = i;
            } else
                continue;

            if(answer[0]*2 + answer[1]*2 +4 == brown)
            {
                answer[0] += 2;
                answer[1] += 2;
                return answer;
            }
        }

        // 소수 일 경우
        answer[0] = yellow + 2;
        answer[1] = 3;

        return answer;
    }
}