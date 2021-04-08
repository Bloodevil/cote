import java.util.*;
import java.text.SimpleDateFormat;


/*
일단 유닉스 타임스탬프로 변환만 해봤습니다.
 */
class Solution {
    public int solution(String[] lines) {
        int answer = 0;
        String firstValue = lines[0];

        String startTime = firstValue.substring(0,23);
        String during = firstValue.substring(24,firstValue.length());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
        long unixTime = 0;
        try {
            unixTime = simpleDateFormat.parse(startTime).getTime();
            unixTime = unixTime / 1000;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("long data: "+unixTime);
        return answer;
    }
}