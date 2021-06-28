package yujeong;

import java.util.Arrays;
import java.util.HashMap;

public class cote_0419 {
    /*배열의 길이가 곧 수의 범위 (0 ~ n)*/
    public int missingNumber(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            numsMap.put(nums[i], 1);
        }//for

        for(int i=1; i<=nums.length; i++){
            if(numsMap.get(i) == null){
                return i;
            }
        }//for

        return 0;
    }
}
