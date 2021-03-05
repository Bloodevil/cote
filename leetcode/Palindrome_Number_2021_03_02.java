class Solution {
    public boolean isPalindrome(int x) {
        if(x >= 0)
        {
            return flipNumber(x);
        }
        return false;
    }

    public boolean flipNumber(int original) {
        //숫자의 자릿수를 끝에서 부터 비교
        String stringOriginal = String.valueOf(original);
        int stringsize = stringOriginal.length();
        if(stringsize / 2 == 0)
        {
            for(int i = 0; i < stringsize; i++)
            {
                if(stringOriginal.charAt(i) != stringOriginal.charAt(stringsize - i - 1)) return false;
            }

        }
        else
        {
            for(int i = 0; i < stringsize; i++)
            {
                if(stringsize / 2 == i) break;
                if(stringOriginal.charAt(i) != stringOriginal.charAt(stringsize - i - 1)) return false;
            }
        }
        return true;

    }
}