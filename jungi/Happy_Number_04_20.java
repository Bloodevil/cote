/*
Recursive and Memoization로 풀어봤습니다.
 */

class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);

        while(n != 1){
            n = getprocessingNumber(n);
            if(arr.contains(n)) {
                return false;
            }
            else{
                arr.add(n);
            }
        }

        return true;
    }

    public int getprocessingNumber (int n){
        int number = 0;

        while(n > 0){
            number += Math.pow((n % 10),2);
            n = n / 10;
        }
        return number;
    }
}