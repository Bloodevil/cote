/*
Name: Woosung Kim
Date: 2021-07-08 Thu
URL: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/

Given an array nums of integers, return how many of them contain an even number of digits.

*/

/*
BruteForce method
Runtime = O(N) because it completes one entire loop once.
Optimization = ... ?
*/
public class EvenNumberDigits070821 {
    public int findNumbers(int[] nums){
        int count = 0;
        for(int i=0; i < nums.length; i++){
            String numberStr = Integer.toString(nums[i]);
            if (numberStr.length() % 2 == 0){
                count ++;
            }
        }
        return count;
    }
}
