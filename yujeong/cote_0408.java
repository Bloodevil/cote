package yujeong;

public class cote_0408 {
    /*
        n개의 계단을 오르는데 1걸음 또는 2걸음을 오를 수 있을 경우 몇가지의 방법이 존재하는지?
    */
    public int climbStairs(int n) {
        int first = 1;
        int second = 2;
        int res = 0;

        /*if(n==1){ //n이 1이거나 2인 경우
            return 1;
        }else if(n==2){
            return 2;
        }*/

        if(n==1 || n==2){
            return n;
        }

        //이 부분은 다른 방법으로 풀다 실패해 discuss를 보고 참고했습니다 ㅠㅠ 다시 해볼게요...
        while (n > 2) {
            res = first + second;
            first = second;
            second = res;
            --n;
        }
        return res;
    }
}
