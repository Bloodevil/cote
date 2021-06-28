package yujeong;

import java.util.Arrays;

public class cote_0423 {
    public static int heightChecker(int[] heights) {
        int cnt=0;
        int[]sortedArr=new int[heights.length];

        for(int i=0; i<heights.length; i++){
            sortedArr[i]=heights[i];
        }

        Arrays.sort(sortedArr); //알맞게 정렬된 배열 생성

        for(int i=0; i<heights.length; i++){
            if(heights[i]!=sortedArr[i]){ //일치하지 않으면 cnt증가
                cnt++;
            }
        }
        
        return cnt;
    }
}
