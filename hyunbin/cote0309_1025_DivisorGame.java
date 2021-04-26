/*
Alice and Bob take turns playing a game, with Alice starting first.
Initially, there is a number N on the chalkboard.  On each player's turn, that player makes a move consisting of:
    Choosing any x with 0 < x < N and N % x == 0.
    Replacing the number N on the chalkboard with N - x.
    Also, if a player cannot make a move, they lose the game.
Return True if and only if Alice wins the game, assuming both players play optimally.

조건1. 0보다 크고 N보다 작은 x중 N의 약수를 x로 선택한다.
조건2. N을 N-x로 바꾼다.
조건3. N-x가 1이거나 N의 약수가 없다면(무슨수?) 그 사람이 진 것이다.
조건4. 앨리스가 이기면 true를 리턴한다. 두 플레이어가 게임에서 최적의 선택을 했다고 가정한다.

푼 방법. 
- 우선 무조건 이기는 수와 무조건 지는 수를 찾았다. (무조건 이김: 2, 무조건 짐: 3)
- 그 다음으로 무조건 이기는 수와 무조건 지는 수를 찾았다. (무조건 이김: 4, 무조건 짐: 5)
- 그 다음으로 무조건 이기는 수와 무조건 지는 수를 찾았다. ... 를 10까지 반복했다. 그리고 코드를 돌려보았다. 그랬더니 억셉트 됨..
*/

class cote0309_1025_DivisorGame {
    public static boolean divisorGame(int N) {
       if(N%2==0){
           return true;
       }else{
           return false;
       }
    }//속도 0ms, 메모리 35.5 

    public boolean divisorGame2(int N) {
        return (N%2==0)?true:false;  
    }//속도는 둘다 0ms인데 얘가 메모리는 더 많이 나왔다. 35.7. 0.2MB의 차이도 실무에서는 유의미한가?
}