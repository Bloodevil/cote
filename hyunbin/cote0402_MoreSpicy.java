import java.util.Arrays;

public class cote0402_MoreSpicy {
    /*
        17:06 started

        while scoville[0] < K
            scoville[0] = scoville[0]+scoville[1]*2
            remove scoville[1]
            mixcount++
            sort scoville

        return mixcount
    */
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Arrays.sort(scoville);
        
        for(int i=0; i<scoville.length; i++){
            if(scoville[0] < K){
                scoville[0] = scoville[0]+scoville[1]*2;
                for(int j=1; j<scoville.length-1; j++){
                    scoville[j]=scoville[j+1];
                }
                answer++;
                Arrays.sort(scoville);
            }else if(answer > 0){
                return answer;
            }
        }

        return -1;
    }
}
