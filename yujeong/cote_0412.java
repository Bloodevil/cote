package yujeong;

public class cote_0412 {
    /*
        ex1) Input: strs = ["flower","flow","flight"]
             Output: "fl"

        ex2) Input: strs = ["dog","racecar","car"]
             Output: ""
    */

    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length==0 || strs==null){ //배열 길이가 0이거나 null일 경우
            return "";
        }else if(strs.length==1){ //배열에 하나의 요소만 존재할 경우
            return strs[0];
        }
        
        String prefix=strs[0];

        for(int i=1; i<strs.length; i++){
            int j=0;
            while(j<prefix.length() && j<strs[i].length() && prefix.charAt(j)==strs[i].charAt(j)){
                j++;
            }//while

            if (j >= 0) {
                prefix = prefix.substring(0, j);
            }else{
                return "";
            }//if

        }//for
        return prefix;
    }
}
