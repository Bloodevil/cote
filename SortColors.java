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

      //하나일때는 정렬할 필요없음
      //두 개 이상일때부터 정렬
      //temp 활용해서 정렬 i 값과 i값 이후의 값들 비교

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
