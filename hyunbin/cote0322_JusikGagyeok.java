/*
초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 
가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

제한사항
prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
prices의 길이는 2 이상 100,000 이하입니다.
*/

class cote0322_JusikGagyeok{
    public int[] solution(int[] prices) {
        /*
            ~ 의식의 흐름 ~
            나와 내 이후 값들을 비교해서
            나와 같거나 크면 떨어지지 않은 것이고 
            나보다 작으면 떨어진 시점이다 
            거기까지의 second를 카운트해서 배열에 담자
        */
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            int sec=0; //초기화 시켜주기
            int price=prices[i]; //비교해야 할 기준값 넣어주기
            for(int j=i+1; j<prices.length; j++){ //다음것부터 끝까지 비교해야 함
                if(price <= prices[j]){ //가격이 같거나 올랐으면 sec을 더해준다
                    sec++;
                }else{ //가격이 떨어졌으면 sec에 1만 더해주고 for문을 빠져나간다...여기서 많이 헤맸다. sec=1이라고 해주면 안되고, 어쨌든 빠져나가기 전까지는 +1을 해줘야 한다.
                    sec++;
                    break;
                }
            }
            answer[i] = sec; //연산이 끝나면 answer배열에 sec값을 넣어준다
        }
        return answer;
    }
}