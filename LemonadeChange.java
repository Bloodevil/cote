public class LemonadeChange {
    /*
        1. 배열 요소 하나당 5달러씩 받는다
        2. 받은 돈을 저장
        3. 5달러보다 많이 받으면 받은 돈에서 거슬러 줌
    */

    public boolean lemonade(int[] bills) {
        boolean result=true;
        int change=0; //받은 돈

        for(int i=0; i<bills.length; i++){
           if(bills[i]==5){ //5달러만 받았을 경우
                change+=bills[i]; //받은 돈에 그대로 저장
           }else if(bills[i]>5){ //5달러 이상을 받았을 경우
                change+=5;
                bills[i]-=5;
                
                if(change>=bills[i]){ //거스름돈이 충분할 경우
                    change-=bills[i];
                }else{
                    result=false; //거스름돈이 모자랄 경우 fals를 리턴
                }
           }//if
        }//for

        return result;
    }
}
