/*
Name: Woosung Kim
Date: 2021-07-08 Thu
https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
Time limit: 30 min

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

*/

/*
I have tried using the 'LINEAR INSERTION SORT'
source: http://faculty.salina.k-state.edu/tmertz/Java/324sorting/linearinsertionsort.pdf

inserting the squared value after sorting between array[0] to array[current].

I believe that runtime is O(n)? but not sure...
I think there should be better solution. I should get back to this problem later agian.
*/

public class SquaresOfSortedArray070821 {
    public int[] sortedSquares(int[] nums) {
        int[] newArray = new int[nums.length];
        for(int i=0; i < nums.length; i++){
            int squared = nums[i] * nums[i];
            if(i==0){
                newArray[0] = squared;
            }
            else {
                int temp = squared;
                int left = i-1;
                while(left >= 0 && newArray[left] > temp){
                    newArray[left+1] = newArray[left];
                    left--;
                }
                newArray[left+1] = temp;
            }
        }
        return newArray;
    }

    public static void main(String[] args){
        int[] nums = {-7,-3,2,3,11};
        SquaresOfSortedArray070821 s = new SquaresOfSortedArray070821();
        int[] ans = s.sortedSquares(nums);
        for(int n:ans){
            System.out.println(n);
        }

    }

}
