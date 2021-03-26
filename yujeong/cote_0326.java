package yujeong;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cote_0326 {
    /*오늘 팔린 책의 수와 제목이 들어오면 가장 많이 팔린 책의 제목을 출력한다
    여러 건일 경우 사전 순으로 앞서는 제목을 출력한다*/

    public static void main(String[] args) {
        //input
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        HashMap<String, Integer> titleMap = new HashMap<String, Integer>();

        //logic
        for(int i=0; i<=count; i++){
            String title=sc.nextLine();
            titleMap.put(title, titleMap.getOrDefault(title, 0)+1); //중복이라면 value(default=0)+1
        }
        
        //output
        System.out.println("result="+getKey(titleMap, Collections.max(titleMap.values())));
        //판매 부수가 2고 두 책이 각각 한 권씩 팔렸을 경우에는 메서드에서 null을 리턴해 결과물이 안 나옴 이유를 모르겠음
        //map이 이닌 다른 방법으로 다시 풀어볼 것
    }

    //최대 value에 해당하는 key를 뽑아내기 위한 메서드
    public static <K, V> K getKey(Map<K, V>map, V value){
        for(K key : map.keySet()){
            if(value.equals(map.get(key))){
                return key;
            }
        }
        return null;
    }
}
