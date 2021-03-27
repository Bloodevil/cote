package heejeong;

// BaekJoon 1302 베스트셀러
import java.io.*;
import java.util.*;

public class BestSeller0326 {
    public static void main(String[] args) throws Exception{
        //get data
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        //save into Treemap for sort (by key)
        Map<String,Integer> map = new TreeMap<>();
        String title = "";
        for(int i=0;i<num;i++){
            title = br.readLine();
            if(map.containsKey(title)){
                map.put(title, map.get(title)+1);
            }else{
                map.put(title,1);
            }
        }

        //find max sell count
        int maxCount = 0;
        for(String best : map.keySet()){
            maxCount = Math.max(maxCount, map.get(best));
        }

        //find bestseller title which has the same number as maxCount
        for(String bestSeller : map.keySet()){
            if(map.get(bestSeller)==maxCount){
                System.out.println(bestSeller);
                break;
            }
        }
    }
}

/*
[입력]
첫째 줄에 오늘 하루 동안 팔린 책의 개수 N이 주어진다.
    이 값은 1,000보다 작거나 같은 자연수이다.
둘째부터 N개의 줄에 책의 제목이 입력으로 들어온다.
    책의 제목의 길이는 50보다 작거나 같고, 알파벳 소문자로만 이루어져 있다.
[출력] 첫째 줄에 가장 많이 팔린 책의 제목을 출력한다.
    만약 가장 많이 팔린 책이 여러 개일 경우에는 사전 순으로 가장 앞서는 제목을 출력한다.

            //베스트셀러보다 적은 수를 MAP에서 제거
        for(int i=1;i<title.length;i++){
            String now = title[i];
            for(int j=i+2;j<title.length;j++){
                String next = title[j];
                if(map.containsKey(next)){
                    if(map.get(now) > map.get(next)){
                        map.remove(next);
                    }
                }else{
                    System.out.println(map);
                    return new String[map.keySet()];
                }
            }
        }
 */
