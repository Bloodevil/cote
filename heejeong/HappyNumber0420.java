package heejeong;

public class HappyNumber0420 {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        if(n == 2 || n == 3){
            return false;
        }
        int sum = 0;
        while(sum != 1 && n != 0){
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }
        sum += Math.pow(n, 2);
        return isHappy(sum);
    }

    // 재귀 호출 StackOverflowError
}
