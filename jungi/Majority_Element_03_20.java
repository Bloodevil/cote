class Solution {
    public int majorityElement(int[] nums) {

        // nums의 길이 & 구하는 값의 count가 n/2 이상
        int n = nums.length;
        int result = 0;
        //제약조건 1<n<50000 & nums[i]-> int 범위-> int 범위

        // testcase Ex1 [3,2],[2,1] Ex2 [2,4], [1,3] -> Map
        // 저번 hashMap활용해보자
        Map<Integer,Integer> map = new HashMap();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0) + 1);//storing num and its freq
        }
        // 정렬 (3,2) (2,1) -> 여기서 value가 가장 높은거 고르면 return


        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}