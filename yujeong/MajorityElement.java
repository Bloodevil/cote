package yujeong;

import java.util.HashMap;

public class MajorityElement {
    /*
        주어진 배열에서 가장 빈번한 요소를 return하기
    */

    public static int majorityElement(int[] nums) {
        int element=0;

        HashMap<Integer, Integer> hmap=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            //getOrDefault를 이용해 중복된 값이 들어갈 때마다 value+1
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);

            if(hmap.get(nums[i])>(nums.length/2)){
                element=nums[i];
            }
        }//for

        return element;
    }
}
