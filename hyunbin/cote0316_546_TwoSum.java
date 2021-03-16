import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

정수 배열인 nums와 정수 target이 주어진다. 
더하면 target값이 되는 두 숫자의 인덱스를 리턴하라.
한가지 배열 요소를 두 번 이상 사용하지 않는다. 솔루션은 하나뿐이라고 가정할 수 있다.
답안을 어떤 순서대로 리턴해도 상관 없다.

constraints
1. 2 <= nums.length <= 10^3
2. -10^9 <= nums[i] <= 10^9
3. -10^9 <= target <= 10^9
4. 오직 하나의 답안만 존재함

*/ 
class cote0316_546_TwoSum{
/*
    의식의 흐름
    리턴되는 답안 배열은 무조건 크기가 2이다.
    target값에서 nums를 뺐을 때 0이 되는 숫자들을 배열에 담아 리턴시키면 될 것 같다.
    그런데 인덱스를 넘기는 거니까 여기서도 해시맵을 쓸수 있지 않을까?
    중첩 for문을 사용해서 풀 수도 있을 거 같고,
    다른 방법도 있을 것 같다. 
*/
    //처음 푼 방법. 중첩 for문을 이용해서 풀었다.
    public int[] twoSum(int[] nums, int target) {
        int[] answer=new int[2];
        //답안 배열 생성

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){ //i와 중복되면 안되니까 
                if(nums[i]+nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }

    //디스커션 참고: 해시맵을 사용한 답안
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> ansMap=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(ansMap.containsKey(target-nums[i])){
                return new int[] {ansMap.get(target-nums[i]), i}; //있으면 해당 키와 i를 배열로 리턴
            }else{
                ansMap.put(nums[i], i); //target과 nums[i]의 차에 해당하는 값이 없으면 맵에 넣어라
            }
        }
        return null;
    }

    //디스커션 참고: 리턴을 포문 안에서 해주는 대신 익셉션을 던졌다.
    public int[] twoSumAns(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}