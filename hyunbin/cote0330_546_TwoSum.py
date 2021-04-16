#  public int[] twoSum2(int[] nums, int target) {
#         Map<Integer, Integer> ansMap=new HashMap<>();

#         for(int i=0; i<nums.length; i++){
#             if(ansMap.containsKey(target-nums[i])){
#                 return new int[] {ansMap.get(target-nums[i]), i}; //있으면 해당 키와 i를 배열로 리턴
#             }else{
#                 ansMap.put(nums[i], i); //target과 nums[i]의 차에 해당하는 값이 없으면 맵에 넣어라
#             }
#         }
#         return null;
#     }
#  //처음 푼 방법. 중첩 for문을 이용해서 풀었다.
#     public int[] twoSum(int[] nums, int target) {
#         int[] answer=new int[2];
#         //답안 배열 생성

#         for(int i=0; i<nums.length; i++){
#             for(int j=i+1; j<nums.length; j++){ //i와 중복되면 안되니까 
#                 if(nums[i]+nums[j] == target){
#                     answer[0] = i;
#                     answer[1] = j;
#                     return answer;
#                 }
#             }
#         }
#         return answer;
#     }

class Solution:
    #used Dictionary
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ansMap = {}

        for i in range(len(nums)):
            if target-nums[i] in ansMap:
                return [ansMap.get(target-nums[i]), i]
            else:
                ansMap[nums[i]] = i
            i+=1
    
    #used double for clause
    def twoSum2(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i]+nums[j] == target:
                    return [i, j]
            i+=1