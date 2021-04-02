import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] scoville, int K){
        int allMixcase = scoville.length-1;
        int mixScoville = 0;

        ArrayList<Integer> tempScoville = (ArrayList<Integer>) Arrays.stream(scoville)
                .boxed().collect(Collectors.toList());

        Collections.sort(tempScoville);

        if(tempScoville.get(0) >= K) return 0;

        for(int cnt = 0; cnt < allMixcase; cnt++)
        {
            mixScoville = tempScoville.get(0)+(tempScoville.get(1)*2);
            tempScoville.remove(0);
            tempScoville.remove(0);
            tempScoville.add(mixScoville);
            Collections.sort(tempScoville);
            if(tempScoville.get(0) >= K) return cnt+1;
        }
        return -1;
    }
}