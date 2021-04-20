class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int temp : bills) {
            if (temp == 5){
                five ++;
                continue;
            } else if (temp == 10) {
                ten ++;
                five --;
            } else if (temp == 20) {
                if (ten >= 1){
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
            }
            
            if (five < 0 || ten < 0) {
                return false;
            }
        }
        return true;
    }
}
