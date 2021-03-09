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
        }
    }
}
