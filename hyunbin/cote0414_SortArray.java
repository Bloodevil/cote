import java.util.Arrays;

public class cote0414_SortArray {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    public int[] sortArray2(int[] nums){
        if(nums.length <= 1) return nums;
      
        int cnt=0;
        
        // while counting amount of every possible swap case..
        /*
            when nums.length = 4 then 4*3
            when nums.length = 5 then 5*4
            but it doesnt work with the last test case (11/11)
            whose length is 10000
            the reason why is the cnt range, I guess.. 
        */
        while(cnt <= nums.length * (nums.length-1)){
            for(int i=0; i<nums.length-1; i++){
                if(nums[i] > nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
                cnt++;
                //System.out.println(nums[i]+", "+nums[i+1]);
            }
        }
        return nums; 
    }

}
