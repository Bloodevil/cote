/*
Pseudocode (의사 코드)

거스름돈을 돌려줄 수 없는 상황이 되면 바로 return false

int[] change = {0, 0} 변수 생성 // 5$와 10$보관함
bills 배열 순회
순회하며 5$들어왔을 때  5$++
10$들어왔을때 5$ 1한장이상 보유시 5$-- 10$++
20$ 들어왔을때 5$ 1장 10$ 1장이상 보유시 -> 5$-- 10$--
20$ 들어왔을때 5$ 3장이상 보유시 -> 5$갯수 = 5$ - 3
 */

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] change = {0, 0};

        for(int i = 0; i < bills.length; i++)
        {
            if(bills[i] == 5)
            {
                change[0] = change[0] + 1;
            }
            else if(bills[i] == 10)
            {
                if(change[0] < 1){return false;}
                else
                {
                    change[0] = change[0] - 1;
                    change[1] = change[1] + 1;
                }
            }
            else if(bills[i] == 20)
            {
                if(1 <= change[0] && 1 <= change[1])
                {
                    change[0] = change[0] - 1;
                    change[1] = change[1] - 1;
                }
                else if(3 <= change[0])
                {
                    change[0] = change[0] - 3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}