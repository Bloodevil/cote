package heejeong;

public class LongestCommonPrefix0412 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // prefix로 시작하지 않을 때
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String [] strs = {"ac","ac","a","a"};
        System.out.println("str = "+longestCommonPrefix(strs));
    }
}
