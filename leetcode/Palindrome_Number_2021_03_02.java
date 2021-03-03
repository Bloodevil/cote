class Solution {
    public boolean isPalindrome(int x) {
        if(x >= 0)// 0은 포함되어야 함, x > 0 했다가 에러 터져서 변경
        {
            int resultNumber;
            resultNumber = flipNumber(x);
            if(x == resultNumber) return true;
        }
        return false;
    }

    public int flipNumber(int original) {
        int temp = 0;
        while(original != 0)
        {
            temp = temp * 10 + original % 10;
            original = original / 10;
        }
        return temp;
    }
}