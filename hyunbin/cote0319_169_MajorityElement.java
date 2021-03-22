import java.util.Arrays;

public class cote0319_169_MajorityElement {
    public int majorityElement(int[] nums) {
        /*
            ~ 의식의 흐름 ~
            nums배열의 숫자들 중 nums.length / 2 보다 많이 포함된 숫자가 있으면 그걸 리턴하면 됨
            일단 포문을 돌아서 해시맵에 저장을 해볼까 아님 해시맵 안쓰고서 풀어볼까
        */

        //일단 정렬 시켜준다
        Arrays.sort(nums);

        //배열이 1개짜리면 바로 리턴
        if(nums.length < 2){
            return nums[0];
        }

        //각 요소가 몇개까지 반복되나 카운트
        int count=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
        //사실 여기서 리턴되면 마조리티 엘리먼트가 없는 것임
        return -1;
    }
}
