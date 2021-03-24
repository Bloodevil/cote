package heejeong;

import java.util.ArrayList;
import java.util.List;

public class Carpet0323 {

    public static void main(String[] args) {
        int brown=8;
        int yellow=1;
        solution(brown,yellow);
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int prime = 0;
        List<Integer> innerWidth = new ArrayList<>();

        for(int i=1;i<=yellow;i++){
            //약수 집합 구하기
            if(yellow%i==0){
                prime++;
                innerWidth.add(i);
            }
        }

        //약수 갯수로 판단
        if(prime>2) {
            //내부 노란색의 최소 가로길이 : prime/2 번째
            for(int i=0;i<prime;i++){
                int y_Width = innerWidth.get(i);
                int y_Height = yellow/innerWidth.get(i);

                //카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
                // brown => (yellow 가로+세로)*2 +4
                if(y_Width>=y_Height && brown==(y_Width+y_Height)*2+4){
                    return answer = new int[]{y_Width+2, y_Height+2};
                }
            }
        }else{
            // yellow가 소수라면  => 약수가 1과 자기자신 뿐이라면 예:7 (1*7)
            return answer = new int[]{yellow + 2, 3};
        }

        return answer;
    }
}

// 중앙 노란색, 테두리 갈색
// 갈색 격자의 수 : 8<= brown <=5000 자연수
// 노란색 격자의 수 : 1<= yellow <=2000000 자연수
// 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return
// 카펫의 가로길이는 세로길이와 같거나, 세로길이보다 길다