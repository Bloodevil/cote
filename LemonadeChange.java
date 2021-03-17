public class LemonadeChange {
    /*
        처음 3 명의 고객으로부터 3 개의 $ 5 지폐를 순서대로 수집합니다. 
        네 번째 고객으로부터 $ 10 청구서를 수금하고 $ 5를 돌려줍니다. 
        다섯 번째 고객으로부터 $ 10 청구서와 $ 5 청구서를 제공합니다. 
        모든 고객이 올바른 변경을 받았으므로 사실을 출력합니다.

        이게 왜 안 되는지 이해가 안돼요.........ㅠ
    */

    public static boolean lemonade(int[] bills) {
        int d5=0, d10=0;

        for(int i=0; i<bills.length; i++){
            if(bills[0]!=5){
                return false; //첫 요소가 5가 아닌 경우 미리 false를 리턴
            }

            if(bills[i]==5){ //5달러를 받았을 경우
                d5+=1; //5달러 1장 받음
            }else if(bills[i]==10){ //10달러를 받았을 경우 
                d10+=1; //10달러 1장 받음
                if(d5>0){
                    d5-=1; //5달러 1장 거슬러 줌
                }else{
                    return false; //5달러가 없어 거슬러 줄 수 없으므로 false return
                }
            }else if(bills[i]==20){
                if(d10>0 && d5>0){
                    d10+=1; //10달러 1장 거슬러 줌
                    d5-=1; //5달러 1장 거슬러 줌
                }else if(d10==0 && d5>2){ //10달러는 없지만, 5달러가 3장 이상일 경우
                    d10+=2; //10달러 2장 받음
                    d5-=3; //5달러 3장 거슬러 줌
                }else{
                    return false;
                }
            }//if
        }//for

        return true;
    }

    public static void main(String[] args) {
        int[]arr=new int[]{5,5,5,10,5,5,10,20,20,20};
        System.out.println(lemonade(arr));
    }
}
