class Solution {
    public int removeElement(int[] nums, int val) {
        /*추가 메모리 공간을 사용하지 않고 가지고 있는 배열로
        nums에 있는 val 값을 제거하라
        음 자바에서 배열은 이미 고정된 크기를 가지고 있기에 삭제하려면
        ArrayList등의 추가적인 메모리를 사용하여 해당 원소를 제외하고 추가하는 방법
        말고 자바에서 직접적으로 해당 요소를 제거하는 방법은 없던것으로 기억한다.
        그렇다면?
        문제의 요구는 val을 제외한 나머지 배열 요소의 총 갯수와 나머지 배열 요소를 담은
        배열을 return해야 한다.
        ex1에서보면 [2,2,3,3] 또는 [2,2,0,0]으로 반환해도 accepted된다고 한다.
        ex2에서도 val을 제외한 총 개수는 필요하나
        nums배열에 val인 2가 포함되어도 상관없다는 말로 보인다.
        그럼 val의 위치를 나머지 보다 뒤로 미루면 될 것 같다.

        1. val 제외한 element의 count구하기
        2. val을 nums 뒤쪽에 위치하게 하기 -> swap
        */
        int count = 0;
        int len = nums.length-1;
        for(int idx : nums) {
            if(nums[idx] != val) count++;
        }

        if(count == 0) return 0;        // 없거나
        if(count == len) return len;    // 전부 val이거나나

       int answer = count;
        int idx = 0;
        while(idx <= len){
            int temp = nums[idx];
            if(temp == val){
                if(nums[len] != val){
                    nums[idx] = nums[len];
                    nums[len] = temp;
                    count--;
                }else{
                    len--;
                }
            }else{
                idx++;
            }
        }
        return answer;
    }
}
/*
Error Case
    Input [0,1,2,2,3,0,4,2] 2
    Output [0,1,4,0]
    Expected [0,1,4,0,3]
 */