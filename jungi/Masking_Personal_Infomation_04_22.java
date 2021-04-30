class Solution {
    public String maskPII(String S) {
        S = S.toLowerCase();
        int idx = S.indexOf('@');
        StringBuilder stringBuilder = new StringBuilder();
        if (idx > 0) {
            // Email Case
            stringBuilder.append(S.charAt(0));
            stringBuilder.append("*****");
            stringBuilder.append(S.charAt(idx - 1));
            stringBuilder.append(S.substring(idx));
        } else {
            StringBuilder digits = new StringBuilder();
            for (char c : S.toCharArray())
                if (Character.isDigit(c)) digits.append(c);
            if (digits.length() == 10) {
                stringBuilder.append("***-***-");
                stringBuilder.append(digits.substring(6));
            } else {
                stringBuilder.append('+');
                for (int i = 0; i < digits.length() - 10; ++i) stringBuilder.append('*');
                stringBuilder.append('-');
                stringBuilder.append("***-***-");
                stringBuilder.append(digits.substring(digits.length() - 4));
            }
        }
        return stringBuilder.toString();
    }
}

/*
자체 개선 하려다가 막막해서 다른분 코드를 가져왔습니다.
*/
