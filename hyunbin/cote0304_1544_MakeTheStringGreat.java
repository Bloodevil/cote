/*
Given a string s of lower and upper case English letters.
A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

0 <= i <= s.length - 2
s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.

Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
Notice that an empty string is also good.

1. ������ �� ���ڰ� ���� �����̸鼭 ���� �ҹ��ڰų� ���� �빮�ڿ��� �Ѵ�. 
2. ������ �� ���ڸ� ���Ͽ� ���� ���ڸ鼭 case�� �ٸ��� �����Ѵ�. 
3. �� String�� ���� String�̴�. 

*/ 

class Solution {
    public String makeGood(String s) {
        StringBuffer res = new StringBuffer(s);
        
        //�� ��Ʈ���̰ų� �ѱ����� ��� �ٷ� �������ش�
        if(res.length() <= 1){
            return res.toString();
        }        

        //�� ���� �̻��� ���
        //������ �� ������ �ڵ尪�� 32�϶� �� �� ����
        //�������� �ݺ�? length�� �� �̻� �پ���� ���� ������. ī��Ʈ�� �پ�� Ƚ���� ���ٱ�?
        //String? StringBuffer?
        int cnt=1;
        while(cnt!=0){
            cnt=0;
            
            //�� ���� ��Ʈ���� ���
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