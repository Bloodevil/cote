class Solution {
    public String maskPII(String S) {
        boolean check = false;
        check = S.contains("@");

        if(check) {
            // Email Case
            S = S.toLowerCase();
            String[] emailArr = new String[3];
            emailArr = seperateEmail(emailArr, S);
            emailArr[0] = appendingAsterisk(emailArr[0]);
            return makeEmail(emailArr);
        }else {
            // Phone Case
            String temp = extractNumber(S);
            int numberLength = temp.length();
            if(numberLength < 11){
                // has not Country Code
                String[] numberArr = new String[3];
                numberArr[0] = temp.substring(0,3);
                numberArr[1] = temp.substring(3,6);
                numberArr[2] = temp.substring(6,10);
                return makePhoneNumber(numberArr);
            }else {
                // has Country Code
                String[] numberArr = new String[4];
                if(numberLength == 11){
                    numberArr[0] = temp.substring(0,1);
                    numberArr[1] = temp.substring(1,4);
                    numberArr[2] = temp.substring(4,7);
                    numberArr[3] = temp.substring(7,11);
                }else if(numberLength == 12){
                    numberArr[0] = temp.substring(0,2);
                    numberArr[1] = temp.substring(2,5);
                    numberArr[2] = temp.substring(5,8);
                    numberArr[3] = temp.substring(8,12);
                }else {
                    numberArr[0] = temp.substring(0,3);
                    numberArr[1] = temp.substring(3,6);
                    numberArr[2] = temp.substring(6,9);
                    numberArr[3] = temp.substring(9,13);
                }
                return makePhoneNumber(numberArr);
            }
        }
    }
    public String[] seperateEmail(String[] emailArr, String s) {
        String[] temp = s.split("@");
        emailArr[0] = temp[0];
        temp = temp[1].split("\\.");
        emailArr[1] = temp[0];
        emailArr[2] = temp[1];
        return emailArr;
    }

    public String appendingAsterisk(String first) {
        String temp = "";
        temp += first.charAt(0);
        temp += "*****";
        temp += first.charAt(first.length()-1);
        return temp;
    }

    public String makeEmail(String[] emailArr){
        String temp = "";
        temp += emailArr[0];
        temp += "@";
        temp += emailArr[1];
        temp += ".";
        temp += emailArr[2];
        return temp;
    }

    public String extractNumber(String s){
        // 0 ~ 9 ASCII CODE -> 48 ~ 57
        String temp = "";
        for(int i = 0; i < s.length(); i++) {
            if(48 <=s.charAt(i) && s.charAt(i) <= 57) {
                temp += s.charAt(i);
            }
        }
        return temp;
    }

    public String makePhoneNumber(String[] numberArr) {

        String temp = "";
        String middle = "";
        if(numberArr.length < 4){
            middle = makeAsterisk(numberArr[1].length());
            temp += "***-"+middle+"-"+numberArr[2];
        }else{
            temp += "+"+makeAsterisk(numberArr[0].length());
            middle = makeAsterisk(numberArr[2].length());
            temp += "-***-"+middle+"-"+numberArr[3];
        }

        return temp;
    }

    public String makeAsterisk(int number) {
        String asterisk = "";
        for(int i = 0; i < number; i++) {
            asterisk += "*";
        }
        return asterisk;
    }
}
/*
Runtime: 11 ms
Memory Usage: 38.1 MB
 */
