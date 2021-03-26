import java.util.*;
import java.util.stream.Collectors;
import java.util.Collections;

/*
요즘 문제에서 맵을 많이 사용하는데 맵에서 정렬이 필요하거나 order한 value의 key를 찾는등의 문제가 많이 나와서 관련 자료구조 및 정보를
찾아봐야겠다는 필요성을 많이 느낍니다.
오늘 문제는 map으로 counting만 하고 그 다음에 maxValue를 구하는것
혹은 maxValue들을 구한다음 sorting하여 가장 낮은 알파벳을 구하는것을 못했습니다.
 */
class Solution {
    public static void main(String[] args){
        // 입력도구 선언
        Scanner sc = new Scanner(System.in);
        // n 값 받기
        int n = sc.nextInt();
        String[] books = new String[n];
        for(int i = 0; i < n; i++)
        {
            books[i] = sc.nextLine();
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String temp : books) map.put(temp, map.getOrDefault(temp, 0) + 1);

        int max = 0;
        String bestSeller = "";
        // HashMap을 돌며 value가 최대값인 책을 찾음
        // 만약 value가 같다면 책이 사전순으로 앞서는 것을 출력
        for(String key : map.keySet()) {
            int value = map.get(key);

            if(max == value && bestSeller.compareTo(key) > 0) {
                bestSeller = key;
                max = value;
            } else if(max < value) {
                bestSeller = key;
                max = value;
            }
        }

        System.out.println(bestSeller);
    }
}