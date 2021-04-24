package heejeong;

public class MaskPII0422 {
    public String maskEmail(String S, int idx){
        S = S.toLowerCase();
        String [] names = S.split("@");
        char first = names[0].charAt(0);
        char last = S.charAt(idx - 1);
        return first+"*****"+last+"@"+names[1];
    }
    public String maskPH(String S){
        String numberOnly = S.replaceAll("[^0-9]","");
        String lastDigit = numberOnly.substring(numberOnly.length()-4);
        if(numberOnly.length() == 10){
            return "***-***-"+lastDigit;
        }else{
            return "+"+"*".repeat(numberOnly.length()-10)+"-***-***-"+lastDigit;
        }
    }
    public String maskPII(String S) {
        int idx = S.indexOf("@");
        if(idx != -1){
            return maskEmail(S, idx);
        }
        return maskPH(S);
    }
}
