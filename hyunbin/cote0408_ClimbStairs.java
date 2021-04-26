public class cote0408_ClimbStairs {
    class Solution {
        public int climbStairs(int n) {
            int answer=0;
            
            /*
            삽질의 흔적
            
            left stairs ls
            if ls is 1 or 2 then
            
            3 = 1 + 1 + 1 
             or 2 + 1
             or 1 + 2
            
            2 = 1 + 1 
             or 2
            
            1 = 1 
            
            if ls is bigger than 2, leftStair - 1 or - 2 and compare it again
            when the leftStair is 0, end recursive function and answer++
            */ 
            
         //   if(n == 1) return 1;
         //   else if(n == 2) return 2;
            
            answer = calcStairs(n, answer);
            
            return answer;
        }
        
        public int calcStairs(int leftStairs, int answer){
            if(leftStairs == 0){
                return 1;
            }else if(leftStairs>=2){
                //case of -2, -1 ... or 
                answer += calcStairs(leftStairs-2, answer);
                answer += calcStairs(leftStairs-1, answer);
            }
            System.out.println(leftStairs+", "+answer);
            return answer;
        }  
        
        public int climbStairs2(int n){
            //solution like the fibonacci
            int[] answer = new int[n];

            if(n <= 2) return n;

            answer[0]=1;
            answer[1]=2;
            
            for(int i=1; i<n; i++){
                answer[i] = answer[i-1] + answer[i-2];
            }
            
            return answer[n];
        }
    }
}
