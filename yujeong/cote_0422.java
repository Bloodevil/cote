package yujeong;

public class cote_0422 {
    /*
        개인정보 마스킹
        이메일의 경우 @앞 아이디의 첫번재 글자와 마지막 글자를 제외한 부분은 * 다섯 개로 교체된다
        아이디의 길이와 관계없이 무조건 다섯 개로 교체됨
    */
    public String maskPII(String S) {
        if(S.contains("@")){ //email
            int lastIdx=S.indexOf('@')-1; //아이디 마지막 글자의 index를 구함
            return (S.substring(0, 1)+"*****"+S.substring(lastIdx)).toLowerCase(); //아이디 첫글자 + ***** + 마지막 글자~끝
        }else{ //phone
            String replace=S.replaceAll("\\D", ""); //숫자 제외 제거
            String res="***-***-"+replace.substring(replace.length()-4);

            if(replace.length()==11){ //if를 덜 쓰는 방법이 있을지 생각해보기...
                return "+*-"+res;
            }else if(replace.length()==12){
                return "+**-"+res;               
            }else if(replace.length()==13){
                return "+***-"+res;
            }

            return res;
        }
    }
}