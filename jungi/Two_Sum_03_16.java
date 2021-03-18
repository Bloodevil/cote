class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i=0; i<nums.length; i++)
        {
            int tempValue = target - nums[i];
            for(int j=i+1; j < nums.length; j++)
            {
                if(tempValue == nums[j])
                {
                    result = new int[]{i, j};
                    return result;
                }
            }
        }
        return result;
    }
}