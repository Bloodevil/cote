package heejeong;

import java.util.HashMap;

public class LemonadeChange0317 {
    //맞게 풀었다고 생각했는데 안되는 이유를 모르겠어요
    public static boolean lemonadeChange(int[] bills) {
    	// 처음에는 잔돈 없음 => 첫 구매 손님이 $5가 아니라면 false
    	if(bills[0]!=5) {
    		return false;
    	}

    	// 처음 무조건 $5
    	// 1. change map 만들어서 풀기 {달러 : 갯수}
    	HashMap<Integer, Integer> change = new HashMap<Integer, Integer>();
    	int five=0; int ten=0;
    	change.put(5,five);
    	change.put(10,ten);

    	for(int i=0;i<bills.length;i++) {
    		if(bills[i]==5) {
    			// 5 달러 추가
    			change.replace(5,five+=1);
    		} else if(bills[i]==10) {
    			change.replace(10,ten+=1);
    			if(change.get(5)>=1) {
    				change.replace(5,five-=1);
    			}else {
    				return false;
    			}
    		} else {
    			if(change.get(5)>=3) {
    				//1. $5 3장 이상
    				change.replace(5,five-=3);
    			}else if(change.get(5)>=1 && change.get(10)>=1){
    				//2. $5 1장이상 $10 1장 이상
    				change.replace(5,five-=1);
    				change.replace(10,ten-=1);
    			}else {
    				return false;
    			}
    		}
    	} //for

    	return true;
    }

}

// 860. Lemonade Change
// each lemonade costs $5
// Customers are standing in a queue to buy from you, and order one at a time
// => 순서대로 주문 (한 번에 하나씩)
// Each customer will only buy one lemonade => 한 개의 레몬에이드만 구매 가능
// pay with either a $5, $10, or $20 bill
// net transaction 순 거래
// Note that you don't have any change in hand at first.
// => 처음에는 잔돈 없음 => 첫 구매 손님이 $5가 아니라면 false
// Return true if and only if you can provide every customer with correct change.
