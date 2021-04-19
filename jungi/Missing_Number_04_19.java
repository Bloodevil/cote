/*
Pseudocode

추가 공간 X
시간복잡도 O(N)

해결방법
1.Sorting
2.idx 증가하며 같지 않은 수 return
-> sorting하려면 추가공간이 들어가는 quicksort는 안되고 merge sort 잘 안떠오름

-> 다른방법

length만큼 전체 수를 더하고 nums의 element를 빼면 missing number가 나올것
1. length 까지 전체 합 구하기
2. 전체합에서 nums의 element 빼기
3. 남은 값 return
 */

class Solution {
    public int missingNumber(int[] nums) {

        int answer = 0;

        for(int idx = 0; idx <= nums.length; idx++) {
            answer += idx;
        }

        for(int idx = 0; idx < nums.length; idx++) {
            answer -= nums[idx];
        }
        return answer;
    }
}