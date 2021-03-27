package heejeong;

public class StockPrice0322 {
    //초 단위로 기록된 주식가격이 담긴 배열 prices
    public int[] solution(int[] prices) {
        //가격이 떨어지지 않은 기간은 몇 초인지 return
        int len = prices.length;
        int[] answer = new int [len];

        // 배열 내 요소를 비교한다.
        for(int i=0;i<len;i++){
            // i가 바뀔 때마다 초기화
            int rise = 0;
            for(int j=i+1;j<len;j++){
                rise++;
                if(prices[i] > prices[j]){
                    break; //for문 탈출
                }
            }
            answer[i] = rise;
        }

        return answer;
    }
}
