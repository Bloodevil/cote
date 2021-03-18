package yujeong;

public class LemonadeChange {
    
    public static boolean lemonade(int[] bills) {
        int d5=0, d10=0;

        for(int i=0; i<bills.length; i++){
            if(bills[i]==5){
                d5+=1;
            }else if(bills[i]==10){
                if(d5>0){
                    d10+=1;
                    d5-=1;
                }else{
                    return false;
                }
            }else if(bills[i]==20){
                if(d10>0 && d5>0){
                    d10-=1;
                    d5-=1;
                }else if(d5>2){
                    d5-=3;
                }else{
                    return false;
                }
            }//if
        }//for

        return true;
    }
}
