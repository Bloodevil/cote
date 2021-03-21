/*
Given a string s of lower and upper case English letters.
A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

0 <= i <= s.length - 2
s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.

Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
Notice that an empty string is also good.

1. 인접한 두 문자가 같은 문자이면서 같이 소문자거나 같이 대문자여야 한다. 
2. 인접한 두 문자를 비교하여 같은 문자면서 case가 다르면 제거한다. 
3. 빈 String도 좋은 String이다. 

*/ 

class Solution {
    public String makeGood(String s) {
        StringBuffer res = new StringBuffer(s);
        
        //빈 스트링이거나 한글자일 경우 바로 리턴해준다
        if(res.length() <= 1){
            return res.toString();
        }        

        //두 글자 이상일 경우
        //인접한 두 문자의 코드값이 32일때 둘 다 제거
        //언제까지 반복? length가 더 이상 줄어들지 않을 때까지. 카운트로 줄어든 횟수를 세줄까?
        //String? StringBuffer?
        int cnt=1;
        while(cnt!=0){
            cnt=0;
            
            //두 글자 스트링일 경우
            if(res.length() == 2 ){
                if(Math.abs(res.charAt(0) - res.charAt(1)) == 32){
                    return "";
                }else{
                    return res.toString();
                }
            }
            
            for(int i=0; i<res.length()-1; i++){
                if(Math.abs(res.charAt(i) - res.charAt(i+1)) == 32){
                    res.replace(i, i+2, "");
                    cnt++;
                }
            }
        }

        return res.toString();
    }
}