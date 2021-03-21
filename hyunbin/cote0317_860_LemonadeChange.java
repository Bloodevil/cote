/*
At a lemonade stand, each lemonade costs $5. 
Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.
Note that you don't have any change in hand at first.
Return true if and only if you can provide every customer with correct change.

1. 레모네이드 가격은 5$이다.
2. 손님들은 queue 형태로 줄서 있고, 한번에 하나만 주문한다. 
3. 잔돈을 잘 거슬러주어야 한다. 그래서 net transaction은 손님이 5불을 지불했을 때이다.
4. 처음엔 잔돈이 없다.
5. 모든 손님에게 잔돈을 잘 거슬러줄 수 있을 때에만 true를 리턴하라. 

Note:
1. 0 <= bills.length <= 10000
2. biils[i]는 5, 10, 20중 한가지.
*/

public class cote0317_860_LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
    /*
        ~ 의식의 흐름 ~
        들어온 돈은 잔돈에 ++ 된다.
        들어온 돈 - 5한 만큼 거슬러줄 수 있어야 한다.
        5, 10불 개수를 저장해야 한다.
        10이면 5불, 20이면 15불(10+5 or 5+5+5)을 거슬러줘야 함.
    */
        int ch5=0;
        int ch10=0;
        for(int i=0; i<bills.length; i++){
            //빌 순서대로 체크해서 5불일 때, 10불일 때, 20불일 때로 나눠준다
            if(bills[i]==5){ //5불 내밀었을 때
                ch5++;
                continue;
            }else if(bills[i]==10){ //10불 내밀었을 때
                if(ch5 > 0){
                    ch5--;
                    ch10++;
                    continue;
                }else{
                    return false;
                }
            }else if(bills[i]==20){ //20불 내밀었을 때
                if(ch5>0 && ch10>0){
                    ch5--;
                    ch10--;
                    continue;
                }else if(ch5>=3){
                    ch5-=3;
                    continue;
                }else{
                    return false;
                }
            }
        }
    return true;
    }
}
