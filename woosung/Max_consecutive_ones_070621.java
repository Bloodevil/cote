/*
Name: Woosung Kim
Date: 2021-07-06 Tue
URL: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/

Given a binary array nums, return the maximum number of consecutive 1's in the array.

*/

public class Max_consecutive_ones_070621{
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int value : nums){
           if(value == 1) {
               count++;
               if(count > maxCount) maxCount = count;
           } else {
               count = 0;
           }
        }
        return maxCount;
    }

    public static void main(String[] args){
        Max_consecutive_ones_070621 solution = new Max_consecutive_ones_070621();
        int[] nums = {1,1,0,1,1,1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,0,0};
        int ans = solution.findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
}

