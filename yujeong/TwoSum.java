package yujeong;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] result=new int[2];

        for(int i=0; i<nums.length; i++){ //배열의 길이만큼 for문 돌림
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;

                    return result;
                }
            }
        }
        return result;
    }
}