class Solution {
    public int[] solution(int[] prices) {
        int leng = prices.length;
        int[] answer = new int[leng];
        //답안의 길이 생성
        /*
        어떻게 해야하나
        1 2 3 2 3
        1 -> 2 3 2 3 떨어지지 않음 ++ ++ ++ ++ ... 4
        2 -> 3 2 3 떨어지지 않음 ++ ++ ++ ... 3
        3 -> 2 3 바로 떨어지는데 1이나옴 1초간 떨어지지 않는다는 것 -> ++
        2 -> 3 떨어지지 않음 ++
        3 비교대상 없음 0
        */

        /*
        sudo
        현재 값이 다음 값과 비교해서 작다 -> 1초동안 유지한다 1
        현재 값이 다음 값과 비교해서 같거나 크다 -> 떨어지지 않음 -> ++
        */
        for(int i = 0; i < leng; i++)
        {
            int keepingMoneyTime = 0;
            int currentValue = prices[i];
            for(int j = i+1; j < leng; j++)
            {
                if(currentValue > prices[j]){
                    keepingMoneyTime++;
                    break;
                }
                else
                {
                    keepingMoneyTime++;
                }
            }
            answer[i] = keepingMoneyTime;
        }
        return answer;
    }
}