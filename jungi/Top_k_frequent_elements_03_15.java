/*
요구사항
nums배열에서 가장 빈번한 elements를 k개만큼 int[]로 반환하시오

int[] result = new int[k] 초기화
nums 배열 순회
순회 중 가장 많이 나온 수를 저장
가장 많이 나오는 수 인지 순회 중 비교
result에 많이 나온 수 K만큼 저장
순회 종료
result 반환
*/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 계수정렬을 위한 배열
        int[] counterArr = new int[10000];
        int max = 0;
        int maxValue = 0;
        int[] temp;

        if(nums.length == 1)
        {
            temp = new int[]{k};
            return temp;
        }
        else
        {
            //nums 순회
            for(int i = 0; i < nums.length; i++)
            {
                counterArr[nums[i]] += 1; // 여기서 에러 outbounds
            }
            // O(N)?

            for(int i = 0; i<counterArr.length; i++)
            {
                if(max < counterArr[i])
                {
                    max = counterArr[i];
                    maxValue = i;
                }
            }
            if(maxValue == k)
            {
                temp = new int[]{maxValue};
            }
            else
            {
                temp = new int[]{maxValue, k};
            }
            return temp;
        }
    }
}
// 제가 풀기에 적합하지 않았던 문제이지만
// 다른 사람의 답안을 보고 최대한 이해하려고 노력해보겠습니다.

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0) + 1);//storing num and its freq
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b) - map.get(a));
        //custom sort priority queue based on map values while adding the records to pq
        pq.addAll(map.keySet());
        int[] res = new int[k];
        for(int i = 0;i<k;i++){
            res[i] = pq.remove();
        }
        return res;
    }
}
// hashmap 생성
// foreach -> getOrDefault
// Map - getOrDefault(key, Default-value)
// getOrDefault는 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환한다.
// PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b) - map.get(a));
// -> 우선순위를 부여하여 Integer형 queue를 생성 (그냥 queue는 FIFO)
//  PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//  Collections.reverseOrder 같이 특정 순서를 부여
// (a,b)->map.get(b) - map.get(a)는 무슨 의미인가
// a, b 매개변수 받아 (b key의 value - a key의 value) 값을 가지고 정렬한다는건데
// 정확한 의도와 람다식을 아직 잘 모르겠다