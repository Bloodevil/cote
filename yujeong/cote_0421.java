package yujeong;

public class cote_0421 {
    /*numExchange는 새 병으로 교환하기 위해 필요한 빈 병의 수*/
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=numBottles, total=numBottles;

        while(empty>=numExchange){
            int temp=empty/numExchange;
            total+=temp;
            empty=temp+empty%numExchange;
        }
        return total;
    }
}
