package heejeong;

//798.Sort Colors
/*
Given an array nums with n objects
objects of the same color are adjacent,
with the colors in the order red, white, and blue.
0 : red 1: white 3: blue
*/
class SortColors  {
    public static void sortColors(int[] nums) {
      //solve this problem without using the library's sort function
      if(nums.length>1){
        for(int i=0;i<nums.length;i++){
          for(int j=i+1;j<nums.length;j++){
            int temp=0;
            if(nums[i]>nums[j]){
              temp = nums[i];
              nums[i] = nums[j];
              nums[j] = temp;
            }//if
          }
        }
      }//if

    }
}
