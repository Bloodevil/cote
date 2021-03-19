package heejeong;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement0319 {

    public static void main(String[] args) {
        int [] nums = {2,2,2,4};
        System.out.println("majorElement = "+majorityElement2(nums));
    }

    public static int majorityElement(int[] nums) {
        int majorElement = 0;

        //for문을 돌며 배열을 담는다. {숫자:개수}
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            // 처음 담는 숫자가 아니라면
            if(map.get(nums[i])!=null){
                map.replace(nums[i], map.get(nums[i])+1);
                System.out.println("i="+i+map);
            }else {
                map.put(nums[i],1);
                System.out.println("i="+i+map);
            }

            //majority element 찾기
            if(map.get(nums[i])>(nums.length/2)){
                majorElement = nums[i];
            }
        }//for

        return majorElement;
    }

    //Solution 보고 감탄한 답안
    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}

//169. Majority Element
// n개 요소를 가진 nums 배열에서
// majority element는 n/2번 이상 존재할 경우로 판단
// majority element 항상 존재하는 것으로 가정
// Could you solve the problem in linear time and in O(1) space?
