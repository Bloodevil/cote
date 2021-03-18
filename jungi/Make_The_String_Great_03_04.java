class Solution {
    public String makeGood(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            if (a != b && Character.toLowerCase(a) == Character.toLowerCase(b)) {
                return makeGood(s.substring(0, i) + s.substring(i+2));
            }
        }
        return s;
    }
}