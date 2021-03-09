public class cote0309_250_principleOfRecursion_1440_ReverseString {
    public void reverseString(char[] s) {
        int end=s.length-1;
        int start=0;
        while(start < s.length/2){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;

            start++;
            end--;
        }//스타트 엔드 정수를 이용하는게 좀 익숙해진거 같다. 보자마자 생각나서 해봤는데 억셉돼서 기뻤음
        //temp를 쓰지 않는 방법은?
    }
}
