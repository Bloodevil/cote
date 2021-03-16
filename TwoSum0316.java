
// 1. Two Sum
// return indices of the two numbers such that they add up to target.
// 배열안의 값 두 개를 더해서 target이 되는 배열 인덱스를 배열형태로 return
// Only one valid answer exists.

public class TwoSum0316 {
	public int[] twoSum(int[] nums, int target) {
		int [] twoSum = new int[2];

		for(int i=0;i<nums.length;i++) {
			//이미 더한 경우는 더하지 않아도 되므로 j=i+1
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					twoSum[0] = i;
					twoSum[1] = j;
					//값을 찾으면 바로 for문을 빠져나오기 위해 return
					return twoSum;
				}
			}
		}

		return twoSum;
	}
}
