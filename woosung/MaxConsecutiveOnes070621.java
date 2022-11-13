/*
Name: Woosung Kim
Date: 2021-07-06 Tue
URL: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/

Given a binary array nums, return the maximum number of consecutive 1's in the array.

*/
//Optimization
public class MaxConsecutiveOnes070621{
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int frontCount = 0;
        int backCount = 0;
        int frontMax = 0;
        int backMax = 0;
        int index = 0;
        int combinedCount = 0;
        //Loop through the array in bi direction -> <-
        if (nums == null) {return 0;}
        if (nums.length == 0) {return 0;}
        if (nums.length == 1) {return nums[0];}
        for(int i=0; i<nums.length/2;i++){
            int frontNum = nums[i];
            int backNum = nums[nums.length-i-1];
            //Count from the front
            if(frontNum == 1){
                frontCount++;
                if(frontCount > frontMax) frontMax = frontCount;
            } else {
                frontCount = 0;
            }
            //Count from the back
            if(backNum == 1) {
                backCount++;
                if(backCount > backMax) backMax = backCount;
            } else {
                backCount = 0;
            }
//            System.out.println("Front: " + frontNum + ", Back: " + backNum);
            index = i;
        }
//        System.out.println("Front Count: " + frontCount + ", BackCount: " + backCount);
        //Find out the middle value for odd length of array and if the value is 1, then find out either count it to front or back
        if(nums.length % 2 != 0) {
            int middleNum = nums[index+1];
//            System.out.println("Middle: " + middleNum);
            if(middleNum == 1){
                if(frontCount >0 && backCount>0){
                    frontCount++;
                } else if (frontCount > 0 && backCount ==0){
                    frontCount++;
                } else if (frontCount == 0 && backCount > 0){
                    backCount++;
                } else if (frontCount == 0 && backCount == 0){
                    frontCount++;
                }
                if(frontCount > frontMax) frontMax = frontCount;
                if(backCount > backMax) backMax = backCount;

                //If frontCount and backCount are still counting, combine them together
                if(frontCount > 0 && backCount > 0){
                    combinedCount = frontCount + backCount;
                }
            }
        } else {
            //If frontCount and backCount are still counting, combine them together
            if(frontCount > 0 && backCount > 0){
                combinedCount = frontCount + backCount;
            }
        }

//        System.out.println(maxCount + ", " + frontMax);
        //Get the max Count
        if (frontMax > maxCount) maxCount = frontMax;
//        System.out.println(maxCount + ", " + backMax);
        if (backMax > maxCount) maxCount = backMax;
//        System.out.println(maxCount + ", " + combinedCount);
        if (combinedCount > maxCount) maxCount = combinedCount;

        return maxCount;
    }

    public static void main(String[] args){
        MaxConsecutiveOnes070621 solution = new MaxConsecutiveOnes070621();
        int[] nums = {1};
        int ans = solution.findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
}

//Brute force
//
//public class MaxConsecutiveOnes070621{
//    public int findMaxConsecutiveOnes(int[] nums) {
//        int maxCount = 0;
//        int count = 0;
//        for(int value : nums){
//           if(value == 1) {
//               count++;
//               if(count > maxCount) maxCount = count;
//           } else {
//               count = 0;
//           }
//        }
//        return maxCount;
//    }
//
//    public static void main(String[] args){
//        MaxConsecutiveOnes070621 solution = new MaxConsecutiveOnes070621();
//        int[] nums = {1,1,0,1,1,1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,0,0,0};
//        int ans = solution.findMaxConsecutiveOnes(nums);
//        System.out.println(ans);
//    }
//}

