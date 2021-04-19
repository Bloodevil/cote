package heejeong;

import java.util.*;

public class MissingNumber0419 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missing = nums.length;
        for (int i = 0; i < missing; i++) {
            if (i != nums[i]){
                return i;
            }
        }
        return missing;
    }

    // 가우스 공식 : 1부터 n까지 합계
    // n(n+1)/2
    public int missingNumber2(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return n * (n+1) / 2 - sum;
    }
}
