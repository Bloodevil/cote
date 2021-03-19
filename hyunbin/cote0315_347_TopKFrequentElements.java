import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/*Given a non-empty array of integers, return the k most frequent elements.
조건1. 비어있지 않은 정수 배열이 주어진다.
조건2. 배열의 숫자들 중, 가장 많이 반복되는 순서대로 K순위까지 리턴해라.
조건3. K는 언제나 1이상이다 (그리고 유일한 엘리먼츠 숫자들보다 같거나 작다)
조건4. 알고리즘은 O(nlogn)보다 나아야 한다. 
조건5. 정답은 유일하다. 다시 말하자면 K 배열은 유일하다. 
조건6. 정답은 어떤 순서대로 출력돼도 상관 없다.
*/
public class cote0315_347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        /* 생각의 흐름
            일단 nums의 요소 종류의 수를 구해볼까
            만약 요소 종류의 수와 K가 일치하면 요소를 종류별로 모두 리턴
            K가 요소 종류의 수보다 작으면 개수가 가장 큰 애들을 리턴
            그러면 요소 종류 배열 elements 에다 만들어서 숫자를 체크해보자
            만들면서 요소마다 개수를 같이 체크해주면 좋을 거 같은뎅
            해시맵을 사용하게 되면? 요소:개수 로 넣을 수 있을 거 같다
        */

        //요소별로 개수를 정리해줄 해시맵, 정렬된 해시맵은 나중에 구글링해서 썼다. 그 전엔 일반 해시맵을 썼음
        SortedMap<Integer, Integer> eleMap=new TreeMap<>();

        //리턴시킬 인트 배열 
        int[] result = new int[k];

        //만약 길이가 1이라면 바로 리턴
        if(nums.length==1){
            result[0] = nums[0];
            return result;
        }
        Map.en
        for(int i=0; i<nums.length; i++){
            if(eleMap.containsKey(nums[i])){
                eleMap.put(nums[i], eleMap.get(nums[i])+1); //이미 키가 있으면 숫자만 업뎃
            }else{
                eleMap.put(nums[i], 1); //키가 없으면 새로 넣어주기
            }
        }
        //이걸 다 돌았으면 요소 정리가 끝난다
        System.out.println(eleMap);
        //K순위까지 리턴해줘야 하는디.. 흠.... //여기서부터 막혀서 구글링 시작
        //소티드맵을 k번째까지만 result배열에 넣어주면 될거 같음
        //주어진 nums에 음수가 있으면 key값으로 정렬되기 때문에 또 꼬인다

        for(int i=0; i<k; i++){
            result[i]=eleMap.lastKey();
            eleMap.remove(eleMap.lastKey()); 
        }

        return result;
    }    
}
