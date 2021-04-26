package yujeong;

public class cote_0322 {
    public static int[] solution(int[] prices) {
        /*
            초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return
        */
        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i]>prices[j]){ //i가 다음 j보다 더 크면 가격이 떨어졌다는 소리
                    answer[i]=j-i; //answer에 j-i값을 넣는다
                    break;
                }else{ //더 작은 인덱스가 걸리지 않을 경우
                        //여기서 조건을 추가해야하나? 했지만 직접 써보니 if에서 걸리지 않으면 여기서 다 걸린다
                    answer[i]=j-i;
                }
            }
        }//for

        return answer;
    }
}
