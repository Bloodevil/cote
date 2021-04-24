package heejeong;

public class MaskPII0422 {
    public String maskPII(String S) {
        // mask an email (at least 8 length)
        int idx = S.indexOf("@");
        if(idx != -1){
            S = S.toLowerCase();
            String [] names = S.split("@");
            char first = names[0].charAt(0);
            char last = S.charAt(idx - 1);
            return first+"*****"+last+"@"+names[1];
        }

        // mask an phone number (at least 10 length)
        // check the number of digit
        String numberOnly = S.replaceAll("[^0-9]","");
        String lastDigit = numberOnly.substring(numberOnly.length()-4);
        switch (numberOnly.length()){
            case 10:
                return "***-***-"+lastDigit;
            case 11:
                return "+*-***-***-"+lastDigit;
            case 12:
                return "+**-***-***-"+lastDigit;
            case 13:
                return "+***-***-***-"+lastDigit;
        }
        return "";
    }

    // 별표갯수가 lastDigit 4개 뺀만큼 있는 규칙을 이용해서
    // 위 코드보다 더 규칙성있게 로직을 구현할 수 있을 것 같은데 떠오르지 않는다.
}
