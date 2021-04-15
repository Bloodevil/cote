package heejeong;

public class ClimbingStairs0408 {
    // 계단을 오를 수 있는 경우의 수 구하기
    // 한번에 1 or 2 steps
    // 1 <= n <= 45

    // Time Limit Exceeded
    public static int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

    // 풀이과정은 피보나치 수열과 같음
    // DP
    public static int climbStairs_arr(int n) {
        if(n <=2){
            return n;
        }

        int [] answer = new int[n];
        answer[0] = 1;
        answer[1] = 2;

        for (int i = 2; i < n ; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer[n-1];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("arr soulution = "+climbStairs_arr(n));
        System.out.println("recursive soulution = "+climbStairs(n));
    }
}
