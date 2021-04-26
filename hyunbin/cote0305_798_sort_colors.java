import java.util.ArrayList;
import java.util.List;

public class cote0305_sort_color {
    /*
    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
    with the colors in the order red, white, and blue.
    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    
    1. 컬러배열의 최대 길이는 300이다 
    2. 컬러배열의 값은 0, 1, 2중 하나다.    
    
    example
    input [2,0,2,1,1,0]
    output [0,0,1,1,2,2]

    1] 각 배열요소의 값을 비교하여 더 작은 것을 앞으로 뺀다
    2] 배열요소의 값이 0이면 맨 앞으로, 2면 맨 뒤로 뺀다
    3] 배열의 길이가 1이면 그대로 리턴한다
    4] 0, 1, 2에 해당하는 배열을 각각 만들어 for문을 돌린 후 해당하는 배열에 넣고 추후 합친다
    5] 0, 1, 2에 해당하는 개수를 세서 새 배열을 만들어준다? --> 이 방법으로 풀었다
    */ 

    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zero++;
            }else if(nums[i]==1){
                one++;
            }else if(nums[i]==2){
                two++;
            }
        }
        int idx=0;

        //포문을 없애보았다...0309
        while(idx<nums.length){
            if(idx<zero){
                nums[idx]=0;
            }else if(idx<one+zero){
                nums[idx]=1;
            }else if(idx<one+zero+two){
                nums[idx]=2;
            }
            idx++;
        }
    }
}


