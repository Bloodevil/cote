public class cote0413_ClimbStairs_ver2 {
    public int climbStairs(int n) {
        //solution like the fibonacci
        int answer = 0;
        int one=1, two=2;
        
        if(n <= 2) return n;
        
        while(n > 2){
            answer = one + two;
            one = two;
            two = answer;
            n--;
        }
        
        return answer;
    }
}
