class Solution {
    public static int[] answer = new int[46];
    public int climbStairs(int n) {
        if(n == 1) return 1;
        else if(n == 2) return 2;

        if (answer[n] != 0) {
            return answer[n];
        } else answer[n] = climbStairs(n-2) + climbStairs(n-1);

        return answer[n];
    }
}