class Solution {
    // 혼자 푼 재귀함수 풀이
    public int fib(int n) {
        if(n == 0) return 0;
        else if(n == 1 || n ==2 ) return 1;
        else return fib(n-2) + fib(n-1);
    }

}
/* 다이나믹 프로그래밍

사용할 시 만족해야 하는 조건
1. 큰 문제를 작은 문제로 나눌 수 있다.
2. 작은 문제에서 구한 정답은 그것을 포함하는 큰 문제에서도 동일하다.

결과값을 리스트등에 저장해서 일단 한 번 값을 저장하고 리스트의 저장된 값을 반환하여 시간복잡도 줄이기!
* */

class Solution {
    // 책의 도움을 받아서 작성한 Top-Down with Memoization 방식입니다.

    // 한 번 계산된 결과를 메모이제이션(Memoization)하기 위한 배열 초기화
    public static int[] d = new int[31];

    // 피보나치 함수(Fibonacci Function)를 재귀함수로 구현 (탑다운 다이나믹 프로그래밍)
    public static int fib(int n) {
        // 종료 조건(1 혹은 2일 때 1을 반환)
        if (n == 0) return 0;
        else if (n == 1 || n == 2) return 1;

        // 이미 계산한 적 있는 문제라면 그대로 반환
        if (d[n] != 0) {
            return d[n];
        }
        // 아직 계산하지 않은 문제라면 점화식에 따라서 피보나치 결과 반환
        d[n] = fib(n - 1) + fib(n - 2);
        return d[n];
    }
}

class Solution {

    // 책의 도움을 받아서 작성한 Bottom-up with DP table 방식입니다.

    // 한 번 계산된 결과를 메모이제이션(Memoization)하기 위한 배열 초기화
    public static int[] d = new int[31];

    // 피보나치 함수(Fibonacci Function) 반복문으로 구현(보텀업 다이나믹 프로그래밍)
    public int fib(int n) {

        // 0번째 피보나치 수 는 0 첫 번째 피보나치 수와 두 번째 피보나치 수는 1
        d[0] = 0;
        d[1] = 1;
        d[2] = 1;

        for (int i = 3; i <= n; i++)
        {
            d[i] = d[i - 1] + d[i - 2];
        }

        return d[n];
    }
}