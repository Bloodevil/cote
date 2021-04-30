/*
 * https://leetcode.com/problems/water-bottles/
 */
class Solution {
public:
    int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles, carriedEmptyBottles = 0;
        while (numBottles != 0) {
            int emptyBottles = numBottles + carriedEmptyBottles;
            numBottles = emptyBottles / numExchange;
            ans += numBottles;            
            carriedEmptyBottles = emptyBottles % numExchange;
        }                
        return ans;
    }
};
