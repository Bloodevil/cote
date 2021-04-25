package heejeong;

public class RemoveElement0416 {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        // int val 과 같은 요소를 뒤로 밀어냄
        for (int i = 0; i < size - 1; i++) {
            for (int j = i+1; j < size ; j++) {
                if (nums[i] == val){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        for(int n : nums){
            if(n == val){
                size--;
            }
        }

        return size;
    }

    public static void main(String[] args) {
        RemoveElement0416 r = new RemoveElement0416();
        int [] nums = {3,2,2,3};
        int val = 3;
        System.out.println("solution = "+r.removeElement(nums, val));
    }
}
