/*
엘리스와 밥이 교대로 게임을하며, 엘리스가 먼저 시작합니다.
처음에는 칠판에 숫자 N이 있습니다. 각 플레이어의 차례에 해당 플레이어는 다음과 같이 이동합니다.
0 < x < N 이며 N % x == 0인 x를 선택한다.

칠판의 숫자를 N에서 N - x로 바꾼다.
둘 중 하나가 이동하지 못하게 되면 게임이 끝난다.
엘리스가 승리했을시 True를 반환하고 밥이 이기면 False를 반환한다.

조건
1 <= N <= 1000

문제 접근
엘리스가 A라고 가정
밥은 B라고 가정
1이면 엘리스의 순서가 없으니 false
2면  A1 N1 -> true
3이면 A1 N2 -> B1 N1 -> false
4이면?? -> A가 1이나 2를 낼 수 있다.
항상 최대 약수를 내는 것인가?
A1 N3 -> B1 N2 -> A1 N1 -> true
or A2 N2 -> B1 N1 -> false

그래서 testCase를 5,6,7 ... 10까지 올려보았다.
최대 약수를 구하고 그것을 기반으로 1,2까지 외통수로 몰아가서 boolean값을 도출하는가?


* */
// 1차
class Solution {
    public boolean divisorGame(int N) {
        int x = 2;
        while(N > 3)
        {
            if(N % x == 0 && N != x)
            {
                N = N - (N / 2);
                x = 2;
            }
            else if(N != x)
            {
                x = x + 1;
                N = N - (N / x);
            }
            else
            {
                x = 1;
                N = N - x;
            }

        }
        if (N == 1) return false;
        if (N == 2) return true;
        if (N == 3) return false;
        return true;
    }
}

/*
임의로 함수를 구성하고 submit 해보았다.
임시로 만들어서 돌려본 코드에서 6일 경우 true가 반환되어야 한다고 나온다.
N == 6 -> A3, N3, flag true-> B1 N2 flag false -> A1 N1 flag true -> return true
즉 x값은 가장 큰 약수 값이 되어야 한다는 말이다.
* */

class Solution {
    public boolean divisorGame(int N) {
        boolean flag = false;
        while(N > 0) // N이 0보다 크다면
        {
            for(int x = N-1 ; x > 0; x--)
            {
                System.out.println(x);
                if(N % x == 0)	// 가장 큰 약수 혹은 1
                {
                    N = N - x;	// n을 n-약수
                    flag = !flag;	// 순서 바꾸기
                }
            }
        }
        return flag;
    }
}

/*
뭔가 잘못된거 같다. 시간이 이미 1시간 가량 소요되었다.
별 수 없이 Discuss에서 괜찮은 답변을 골라보았다.
*/
class Solution {
    public boolean divisorGame(int N) {
        return N % 2 == 0;
    }
}
/*
아뿔사....
그런데 풀이 중 조건을 간과했다. 서로 최선의 이기는 수를 생각한다는 것
그렇다면 짝수나 홀수가 될 때마다 승자가 바뀔 뿐일 것이다.

이렇게 된 이상 이 사람이 해놓은 다른 풀이도 봐보자.
* */

//    O(N) - Top Down Recursive Solution

class Solution {
    public boolean divisorGame(int N) {

        if (N==1) return false;
        if (N==2) return true;

        for (int i=1;i<=N;i++){
            if (N%i == 0)
                return !(divisorGame(N-i));
        }
        return false;
    }
}

//    O(N) - Recursive with Memoization

class Solution {
    public boolean divisorGame(int N) {
        boolean[] cache = new boolean[N+1];
        if (N== 1){
            cache[1] = false;
            return false;
        }
        if (N== 2){
            cache[2] = true;
            return true;
        }
        for (int i=1;i*i<=N;i++){
            if (N % i == 0){
                cache[i] = !(divisorGame(N-i));
                return cache[i];
            }
        }
        return false;
    }
}

//    Bottom up Approach
class Solution {
    public boolean divisorGame(int N) {

        boolean[] dp = new boolean[N+1];
        for(int i=1;i<=N;i++)
        {
            if(i==1) dp[i]=false;
            else if(i==2) dp[i]=true;
            else{
                for(int j=1;j*j<=i;j++)
                {
                    if(i%j==0)
                    {
                        dp[i] = !dp[i-j];
                        break;
                    }
                }
            }
        }
        return dp[N];
    }
}