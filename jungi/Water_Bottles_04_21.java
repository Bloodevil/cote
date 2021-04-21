/*
의사 코드

예제 1번을 보면
9개의 물과 3의 교환비율이 정해졌다.
9 + (9/3) + (9/3)/3) = 13
몫이 numExchange보다 클 경우 계속 더해주는 풀이
-> 몫과 나머지를 더한 값이 교환비 보다 크거나 같을 경우

Runtime: 0 ms, faster than 100.00% of Java online submissions for Water Bottles.
Memory Usage: 35.5 MB, less than 73.63% of Java online submissions for Water Bottles.
 */

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maximumBottles = numBottles;
        int emptyBottles = numBottles;
        if(numBottles < numExchange) {
            return numBottles;
        }else {
            while(emptyBottles >= numExchange){
                numBottles = exchange(emptyBottles, numExchange);
                int temp = numBottles + (emptyBottles % numExchange);
                emptyBottles = 0;
                maximumBottles += numBottles;
                emptyBottles += temp;
            }
        }
        return maximumBottles;
    }

    public int exchange(int emptyBottles, int numExchange){
        return emptyBottles / numExchange;
    }

}
