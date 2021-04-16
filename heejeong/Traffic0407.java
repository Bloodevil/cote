package heejeong;

import java.util.*;

public class Traffic0407 {
    public static int solution(String[] lines) {
        if(lines.length == 1){
            return 1;
        }

        Map<Integer,Integer> map = new HashMap<>();

        for (String time : lines) {
            // ss 얻기
            String [] each = time.split(" ");
            String [] ss = each[1].split(":");

            // 시작범위, 끝범위 계산하기
            int index = each[2].indexOf("s");
            float start = Float.parseFloat(each[2].substring(0, index));  // 2.0
            float end = Float.parseFloat(ss[2]);  // 4.001

            start = Math.round((end * 1000) - (start * 1000) - 1)/1000.0f; // 2.003

            // 정수 값 넣기
            for (int i = (int)start; i <= (int)end; i++) {
                System.out.println("i="+i);
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        // 최대값 뽑기
        int max = 0;
        for(int key : map.keySet()){
            max = Math.max(max, map.get(key));
        }

        return max;
    }

    public static void main(String[] args) {
        String [] lines = {"2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s"};
        System.out.println("solution = "+solution(lines));
    }
}
