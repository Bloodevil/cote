package heejeong;

import java.util.ArrayList;
import java.util.List;

public class Carpet0323 {

    public static void main(String[] args) {
        int brown=8;
        int yellow=1;
        solution(brown,yellow);
    }

    //시간 내 해결하지 못했고, 지금 일부 테스트 케이스 작동 실패 (로직 오류 찾아내야함)
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        //yellow가 1이 아닌 제곱수라면 예) 4, 9 ...
        int square = (int)Math.sqrt(yellow)*10/10;
        if(yellow!=1 && yellow==square*square){
            //정사각형 모양 배치
            if((square*4)+4==brown){
                answer = new int[]{square, square};
                return answer;
            }
        }else{
            int prime = 0;
            List<Integer> innerWidth = new ArrayList<Integer>();

            for(int i=1;i<=yellow;i++){
                //약수 집합 구하기
                if(yellow%i==0){
                    prime++;
                    innerWidth.add(i);
                    //System.out.println("innerWidth"+innerWidth);
                }
            }

            //약수 갯수로 판단
            if(prime>2) {
                //카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
                //내부 노란색의 최소 가로길이 : prime/2 번째
                for(int i=prime/2;i<prime;i++){
                    int y_Width = innerWidth.get(i);
                    int y_Height = yellow/innerWidth.get(i);

                    // brown => (yellow 가로+세로)*2 +4
                    if(brown==(y_Width+y_Height)*2+4){
                        answer = new int[]{y_Width+2, y_Height+2};
                        return answer;
                    }
                }
            }else{
                // yellow가 소수라면
                // 약수가 1과 자기자신 뿐이라면 예_7 (1*7)
                answer = new int[]{yellow + 2, 3};
                return answer;
            }
        }

        return answer;
    }
}

// 중앙 노란색, 테두리 갈색
// 갈색 격자의 수 : 8<= brown <=5000 자연수
// 노란색 격자의 수 : 1<= yellow <=2000000 자연수
// 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return
// 카펫의 가로길이는 세로길이와 같거나, 세로길이보다 길다

/*
        // brown + yellow 의 약수 집합 중
        int carpet = brown + yellow;
        List<Integer> width = new ArrayList<Integer>();
        List<Integer> height = new ArrayList<Integer>();

        for(int i=1;i<=carpet;i++){
            if(carpet%i==0){
                width.add(i);
            }
        }

        for(int i=carpet;i>0;i--){
            if(carpet%i==0){
                height.add(i);
            }
        }

        System.out.println("가로"+width);
        System.out.println("세로"+height);
 */